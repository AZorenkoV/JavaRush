package ua.javarush.task.task17.task1720;

public class Bankomat {

    static BankAccount account = new BankAccount("Amigo");

    public static volatile boolean isStopped;

    public static void main(String[] args) throws InterruptedException {
        addMoney.start();
        SpendThread spendThread = new SpendThread();
        SpendThread spendThread1 = new SpendThread();
        SpendThread spendThread2 = new SpendThread();
        spendThread.start();
        spendThread1.start();
        spendThread2.start();
        Thread.sleep(4000);
        isStopped = true;
    }

    private static Thread addMoney = new Thread() {
        @Override
        public void run() {
            while (!isStopped) {
                account.deposit("1000");            // кладемо на рахунок
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    };


    public static class SpendThread extends Thread {

        @Override
        public void run() {
            while (!isStopped) {
                try {
                    account.withdraw("100");             // знімаємо з рахунку
                } catch (NotEnoughMoneyException e) {
                    System.out.println("Недостатньо грошей");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
