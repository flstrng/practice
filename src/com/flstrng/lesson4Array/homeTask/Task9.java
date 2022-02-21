package com.flstrng.lesson4Array.homeTask;

import java.util.Random;
import java.util.Scanner;

/*
9)Пользователь должен указать с клавиатуры положительное чётное число,
а программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том,
сумма какой половины массива больше: левой или правой,
либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то выдать соответствующее сообщение

 */
public class Task9 {
    public static void main(String[] args) {
        int number = 0, sumLeft = 0, sumRight = 0;
        System.out.println(" введите положительное чётное число ");
        do {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            System.out.println("введено неподходящее число");

        } while (number %2 !=0);

        int[] myArray = new int[number];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(16);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < (number / 2); i++) {
            sumLeft += myArray[i];
            sumRight += myArray[number - 1 - i];
        }

        if (sumLeft < sumRight) {
            System.out.println("сумма правой половины больше суммы левой ");
        } else if (sumLeft > sumRight) {
            System.out.println("сумма левой половины больше суммы правой ");

        } else {
            System.out.println(" суммы половин равны");
        }

    }
}
