package com.vitaliy.task1;

public class Summator {
    public static int sum(String input) {
        return input.chars().mapToObj(i -> (char)i).filter(Character::isDigit).
                mapToInt(x -> Integer.parseInt(String.valueOf(x))).reduce(0, Integer::sum);
    }
}