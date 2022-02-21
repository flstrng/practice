package com.flstrng.lesson4Array;

import java.util.Random;

public class lesson4Array {
    public static void main(String[] args) {
//        int[] array = new int[3];
//        array[0] = 56;
//        array[1] = 345;
//        array[2] = 123;
//        for (int i = 0; i < 3; i++) {
//            System.out.println(array[i]);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the value: ");
//        int a = scanner.nextInt();
//        System.out.println(a);
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Введи число ");
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array[i]);
//        }
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt(100));
//        }
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array [i] = random.nextInt(50);
        }
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }

    }

}
