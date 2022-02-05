package com.vitaliy.task5;

import java.util.ArrayList;
import java.util.Comparator;

public class Safe {
    private final int volume;

    public Safe(int volume) {
        this.volume = volume;
    }

    public int composeItems(ArrayList<Item> items) {
        int[][] table = new int[2][volume + 1];
        items.sort(Comparator.comparing(Item::getVol));

        for (Item item : items) {
            for (int curVol = 1; curVol < volume + 1; curVol++) {
                table[1][curVol] = Math.max(table[0][curVol], (item.getVol() > curVol) ? 0
                        : (item.getCost() + table[0][curVol - item.getVol()]));
            }

            table[0] = table[1].clone();
        }

        return table[0][volume];
    }
}