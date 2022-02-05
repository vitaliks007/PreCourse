package com.vitaliy.task2;

import java.util.ArrayList;

public class Simple {
    public static ArrayList<Integer> getSimples(int input) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input % 2 == 0) {
            input /= 2;
            list.add(2);
        }

        int i = 3;
        while (i <= input) {
            while (input % i == 0) {
                list.add(i);
                input /= i;
            }
            i += 2;
        }

        return list;
    }
}
