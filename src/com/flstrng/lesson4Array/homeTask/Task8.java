package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9]
и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен
равняться отношению элемента из первого массива с i-ым индексом
к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке),
затем вывести количество целых элементов в третьем массиве.

 */
public class Task8 {
    public static void main(String[] args) {
        int[] myArray1 = new int[10];
        int[] myArray2 = new int[10];
        double[] myArray3 = new double[10];
        Random random1 = new Random();
        Random random2 = new Random();

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = random1.nextInt(9);
            System.out.print(myArray1[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = random2.nextInt(9);
            System.out.print(myArray2[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = (double)myArray1[i] / myArray2[i];
            System.out.print(myArray3[i] + " ");
        }
        System.out.println();
        int q = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] % 10 == 0)
                q++;
        }
        System.out.println("количество целых элементов в третьем массиве " + q);

    }


}
