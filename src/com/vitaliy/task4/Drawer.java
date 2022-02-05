package com.vitaliy.task4;

import java.util.Comparator;

public class Drawer {
    public static final byte[] alph = {119, 18, 93, 91, 58, 107, 111, 82, 127, 123};

    private static boolean checkBit(int x, int i) {
        return ((alph[x] >> (6 - i)) & 1) == 1;
    }

    private static void printSevSegHor(String input, int i, int maxDigit) {
        for (int j = 0; j < input.length(); j++) {
            int x = Character.getNumericValue(input.charAt(j));
            String spec = "*";
            if (x == maxDigit) {
                spec = String.valueOf(maxDigit);
            }

            if (checkBit(x, i)) {
                System.out.printf("%s   ", spec.repeat(4));
            } else {
                System.out.printf((checkBit(x, i + 1) || checkBit(x, i - 2)) ? "%s  " : "   ", spec);
                System.out.printf((checkBit(x, i + 2) || checkBit(x, i - 1)) ? "%s   " : "    ", spec);
            }
        }
        System.out.println();
    }

    public static void printSevSegVert(String input, int i, int maxDigit) {
        for (int j = 0; j < input.length(); j++) {
            int x = Character.getNumericValue(input.charAt(j));
            String spec = "*";
            if (x == maxDigit) {
                spec = String.valueOf(maxDigit);
            }

            System.out.printf(checkBit(x, i) ? "%s  " : "   ", spec);
            System.out.printf(checkBit(x, i + 1) ? "%s   " : "    ", spec);
        }
        System.out.println();
    }

    public static void draw(String input) {
        int i = 0;
        int maxDigit = input.chars().mapToObj(obj -> (char)obj).map(Character::getNumericValue)
                .max(Integer::compare).get();

        while (i < 7) {
            if (i % 3 == 0) {
                printSevSegHor(input, i, maxDigit);
                i++;
            } else {
                for (byte j = 0; j < 2; j++) {
                    printSevSegVert(input, i, maxDigit);
                }
                i += 2;
            }
        }
    }
}