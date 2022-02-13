package com.flstrng.task;

/**
 * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
 * и положительное оно или отрицательное. Например, "это однозначное положительное число".
 * Достаточно будет определить, является ли число однозначным,
 * "двухзначным или трехзначным и более.
 */
public class Task1 {
    public static void main(String[] args) {

        int number = -105;
        if (number > 0 && number <10)  {
            System.out.println(number + " это однозначное положительное число");
        }else if (number >= 10 && number <100){
            System.out.println(number + " это двузначное положительное число");
        }else if(number >= 100) {
            System.out.println(number + " это трехзначное положительное и более число");
        }else if (number < 0 && number > -10){
            System.out.println(number + " это однозначное отрицательное число");
        }else if (number < 0 && number >= -99) {
            System.out.println(number + " это двузначное отрицательное число");
        } else{
            System.out.println(number + " это трехзначное отрицательное и более число");
        }


    }
}