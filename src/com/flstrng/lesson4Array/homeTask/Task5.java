package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15]каждый,
выведите массивы на экран в двух отдельных строках.
Посчитайте среднее-арифметическое элементов каждого массива
и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).

 */
public class Task5 {
    public static void main(String[] args) {
        int[] myArray1 = new int[5];
        int[] myArray2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double average1 = 0;
        double average2 = 0;
        Random random1 = new Random();
        Random random2 = new Random();


        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = random1.nextInt(15);
            System.out.print(myArray1[i] + " ");
            sum1 += myArray1[i];
        }
        System.out.println();

        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = random2.nextInt(15);
            System.out.print(myArray2[i] + " ");
            sum2 += myArray2[i];
        }
        System.out.println();
        average1 = sum1/5;
        average2 = sum2/5;

        if (average1 < average2) {
            System.out.println("среднее арифметическое первого массива\n" +
                    "больше");
        } else if (average2 > average1) {
            System.out.println("среднее арифметическое второго массива\n" +
                    "больше");
        } else {
            System.out.println("среднее арифметическое первого массива\n" +
                    " и второго массива равны");
        }



    }


}
