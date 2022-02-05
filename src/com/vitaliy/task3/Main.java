package com.vitaliy.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = WordProcessor.process(text);
        System.out.println(text);
    }
}
