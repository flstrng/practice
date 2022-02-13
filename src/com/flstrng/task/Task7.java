package com.flstrng.task;

/**
 * В переменную записываете количество программистов. В зависимости от количества программистов
 * необходимо вывести правильно окончание. Например:
 * • 2 программиста
 * • 1 программист
 * • 10 программистов
 * • и т.д.
 */
public class Task7 {
    public static void main(String[] args) {

//    программист 1, 21, 31 и тд кроме 11
//    программиста 2, 3, 4
//    программистов 5, 6, 7, 8, 9, 10, 12-30
        int programmer = 124;

        if ((programmer % 10 == 1) && (programmer % 100 !=11)) {
            System.out.println(programmer + " программист");
        }else if ((programmer % 10 == 2) || (programmer % 10 == 3) || (programmer % 10 == 4) ) {
            System.out.println(programmer + " программиста");
        }else {
            System.out.println(programmer + " программистов");

        }

    }
}
