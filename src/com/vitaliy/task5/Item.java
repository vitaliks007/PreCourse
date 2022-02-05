package com.vitaliy.task5;

public class Item {
    private final int cost;
    private final int vol;

    public Item(int cost, int vol) {
        this.cost = cost;
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public int getCost() {
        return cost;
    }
}