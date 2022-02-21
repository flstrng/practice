package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
 Выведите  массив на экран. Подсчитайте сколько в массиве чётных элементов
 и выведете это количество на экран на отдельной строке.
 */
public class task3 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(99);
            System.out.print(myArray[i] + " ");
            if (myArray[i] % 2 == 0) total++;

        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + total + " четных элементов");

    }


}

