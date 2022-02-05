package com.vitaliy.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemReader {
    public static ArrayList<Item> itemsGet() {
        ArrayList<Item> items = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            items.add(new Item(in.nextInt(), in.nextInt()));
        }

        return items;
    }
}
