package com.vitaliy.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int input = in.nextInt();
            System.out.println(Simple.getSimples(input));
        } else {
            System.out.println("Введено не целое число!");
        }
    }
}