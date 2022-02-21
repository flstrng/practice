package com.flstrng.lesson4Array.homeTask;

import java.util.Random;
import java.util.Scanner;

/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 0, c = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" введите число больше 3 ");
            n = scanner.nextInt();
            if (n < 4) {
                System.out.println("введено неподходящее число");
            }
        } while (n < 4);

        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            Random random = new Random();
            array1[i] = random.nextInt(n + 1);
            System.out.print(array1[i] + " ");
            if (array1[i] % 2 == 0 ) c++;
        }
        System.out.println("");
        if (c > 0) ;
        {
            int[] array2 = new int[c];
            for (int m = 0, b = 0; m < array1.length; m++) {
                if (array1[m] % 2 == 0 ) {
                    array2[b] = array1[m];
                    System.out.print(array2[b] + " ");
                }
            }

        }
    }
}
