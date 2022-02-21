package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
4)Создайте массив из 20 случайных целых чисел из отрезка [0;20].
Выведите массив на экран в строку. Замените каждый элемент
с нечётным индексом на ноль. Снова выведете массив на экран
на отдельной строке.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] myArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(99);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) myArray[i] = 0;
            System.out.print(myArray[i] + " ");

        }


    }
}
