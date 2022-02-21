package com.flstrng.lesson4Array.homeTask;

import java.util.Random;

/*
 * Создайте массив из 12 случайных целых чисел из отрезка [0;15].
 * Определите  какой элемент является в этом массиве максимальным
 * и сообщите индекс его последнего вхождения в массив.

 */
public class task7 {
    public static void main(String[] args) {
        int[] myArray = new int[12];
        int maxElement = 0;
        int index = 0;
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(15);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxElement)
            maxElement = myArray[i];
            index = i;
        }
        System.out.println("в этом массиве максимальным является элемент " + maxElement);
        System.out.println("индекс последнего вхождения в массив " + myArray[index]);

    }
}
