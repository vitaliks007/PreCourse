package com.vitaliy.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Сначала вводится макс размер рюкзака, далее через пробелы ценность, затем объем каждого предмета
        // Для окончания ввода любой не числовой символ
        Scanner in = new Scanner(System.in);
        Safe safe = new Safe(in.nextInt());
        System.out.println(safe.composeItems(ItemReader.itemsGet()));
    }
}