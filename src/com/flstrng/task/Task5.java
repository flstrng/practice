package com.flstrng.task;

/**
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task5 {
    public static void main(String[] args) {
        int number1 = -1;
        int number2 = -1;
        int number3 = -1;

        if (number1 >0 && number2 >0 && number3 > 0) {
            System.out.println("количество положительных чисел в наборе 3");
        }else if ((number1 < 0 && number2 > 0 && number3 >0) ||
                (number1 > 0 && number2 < 0 && number3 >0) || (number1 > 0 && number2 > 0 && number3 < 0) ) {
            System.out.println("количество положительных чисел в наборе 2");
            System.out.println("количество отрицательных чисел в наборе 1");
        }else if ((number1 < 0 && number2 < 0 && number3 >0) ||
                (number1 > 0 && number2 > 0 && number3 <0) || (number1 > 0 && number2 < 0 && number3 < 0) ) {
            System.out.println("количество положительных чисел в наборе 1");
            System.out.println("количество отрицательных чисел в наборе 2");
        }else{
            System.out.println("количество положительных чисел в наборе 0");
            System.out.println("количество отрицательных чисел в наборе 3");

    }
}
}

