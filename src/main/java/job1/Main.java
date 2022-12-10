package job1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Написать метод, принимающий на вход два целых числа и проверяющий," +
                " что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true," +
                " в противном случае – false.\n");
        System.out.println(ex1());
        System.out.println("\nНаписать метод, которому в качестве параметра передается целое число, метод должен" +
                " напечатать в консоль, положительное ли число передали или отрицательное.\nЗамечание: ноль считаем" +
                " положительным числом.\n");
        ex2();
        System.out.println("\nНаписать метод, которому в качестве параметра передается целое число. Метод должен" +
                " вернуть true, если число отрицательное, и вернуть false если положительное.\n");
        System.out.println(ex3());
        System.out.println("\nНаписать метод, которому в качестве аргументов передается строка и число, метод должен" +
                " отпечатать в консоль указанную строку, указанное количество раз;\n");
        ex4();
        System.out.println("\nНаписать метод, который определяет, является ли год високосным, и возвращает boolean" +
                " (високосный - true, не високосный - false). Каждый 4-й год является високосным,\nкроме каждого 100-го," +
                " при этом каждый 400-й – високосный.\n");
        ex5();
        System.out.println("\nЗадать целочисленный массив, состоящий из элементов 0 и 1. Например:" +
                " [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;\n");
        ex6();
        System.out.println("\nЗадать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями" +
                " 1 2 3 4 5 6 7 8 … 100;\n");
        ex7();
        System.out.println("\nЗадать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа" +
                " меньшие 6 умножить на 2;\n");
        ex8();
        System.out.println("\nСоздать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)," +
                " и с помощью цикла(-ов) заполнить его диагональные элементы единицами\n(можно только одну из диагоналей," +
                " если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких" +
                " элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];\n");
        ex9();
        System.out.println("\nНаписать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий" +
                " одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;\n");
        ex10();
        System.out.println("\nЗадать одномерный массив и найти в нем минимальный и максимальный элементы;\n");
        ex11();

    }


    private static boolean ex1() {
        System.out.print("Введите два целых числа через пробел: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    private static void ex2() {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    private static boolean ex3() {
        System.out.print("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void ex4() {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Введите сколько раз напечатать строку: ");
        int a = Integer.parseInt(sc.next());
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }

    }

    private static void ex5() {
        System.out.print("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        if (a % 400 == 0) {
            System.out.println("Год високосный");
        } else if (a % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (a % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    private static void ex6() {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex7() {
        int[] arr = new int[100];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void ex9() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ex10() {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        System.out.print("Введите ячейку массива (целое число): ");
        int initialValue = Integer.parseInt(sc.next());
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex11() {
        Random rd = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Min = " + min + ";  Max = " + max + ".");
    }
}
