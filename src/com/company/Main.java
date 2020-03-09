package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	                // Запрос длыны последовательности
            Scanner in = new Scanner(System.in);
            System.out.println("Введите длину последовательности Фибоначчи больше двух");
            int n = in.nextInt();
                    // Проверка корректности введенного числа
            if (n<=2) {
                System.out.print("Веедено неверное число, вывод последовательности остановлен");
                         } else {
                    // Инициализация массива последовательности

            long fibon [] = new long [n];
                    // Вывод массива последовательности
            for (int i = 0; i < fibon.length; i++) {
                if (i < 2) {
                    fibon[i] = i;
                    System.out.print(fibon[i] + " ");
                } else {
                    fibon[i] = fibon[i - 1] + fibon[i - 2];
                    System.out.print(fibon[i] + " ");
                }
            }
        }
    }
}
