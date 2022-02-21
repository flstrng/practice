package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
 *Создайте массив из 4 случайных целых чисел из отрезка [0;10],
 * выведите его на экран в строку. Определить и вывести на экран
 * сообщение о том, является ли массив строго возрастающей
 * последовательностью.

 */
public class task6 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < myArray[i + 1]) {
                System.out.println(" последовательность строго возрастающая");
                break;

            }

        }

    }
}
