package com.flstrng.task;

/**
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе
 */
public class Task4 {
    public static void main(String[] args) {
        int number1 = -2;
        int number2 = -1;
        int number3 = -9;

        if (number1 > 0 && number2 > 0 && number3 >0) {
            System.out.println("количество положительных чисел в наборе 3");
        }else if ((number1 < 0 && number2 > 0 && number3 >0) ||
                (number1 > 0 && number2 < 0 && number3 >0) || (number1 > 0 && number2 > 0 && number3 < 0) ) {
            System.out.println("количество положительных чисел в наборе 2");
        }else if ((number1 < 0 && number2 < 0 && number3 >0) ||
                (number1 > 0 && number2 > 0 && number3 <0) || (number1 > 0 && number2 < 0 && number3 < 0) ) {
            System.out.println("количество положительных чисел в наборе 1");
        }else{
            System.out.println("количество положительных чисел в наборе 0");

        }


    }
}
