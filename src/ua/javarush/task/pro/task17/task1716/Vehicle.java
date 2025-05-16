package ua.javarush.task.pro.task17.task1716;

/* 
Дорожній рух
*/

public interface Vehicle {
    default void start(){};
    void move();
    default void stop(){};
}
