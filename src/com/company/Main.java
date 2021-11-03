package com.company;
/*Задание 1.
Вариант 2. Дан массив n целых чисел. Найти длину самой длинной возрастающей последовательности.

Задание 2.
Вариант 2. Дана строка, состоящая из произвольных символов. Найти в ней первый неповторяющийся символ.

Задание 3.
Вариант 2. Дан двумерный массив nxn целых чисел. Выполнить его поворот против часовой стрелки.*/


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int nCols = 6;
    public static int nRows = 9;
    public static int[] arr = new int[20];
    public static int[][] a = new int[nRows][nCols];
    public static String s = "i believe i can fly, maybe";

    public static void main(String[] args) {
        System.out.println("----------Задание 1. Вариант 2.----------");
        fillRandom();
        System.out.println(Arrays.toString(arr));
        task1();
        System.out.println("\n----------Задание 2. Вариант 2.----------");
        System.out.println(s);
        task2();
        System.out.println("\n----------Задание 3. Вариант 2.----------");
        fillOrder();
        printArray(a);
        task3(a);
        System.out.println();
        printArray(task3(a));

    }

    public static void task1() {
        int result = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] <= arr[i - 1])
                cur = 0;
            cur++;
            result = Math.max(result, cur);
        }
        System.out.println("Длина самой длинной возрастающей последовательности равна - " + result);
    }

    public static void task2() {
        for (Character c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("Первый неповторяющийся символ в данной строке это - " + c);
                break;
            }
        }
    }

    public static int[][] task3(int[][] a) {
        int[][] temp = new int[nCols][nRows];
        for (int i = 0; i < nCols; i++) {
            for (int j = 0; j < nRows; j++) {
                temp[i][j] = a[j][nCols - i - 1];
            }
        }
        return temp;
    }


    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
    }

    public static void fillOrder() {
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++)
                a[i][j] = i * nCols + j + 1;
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}



