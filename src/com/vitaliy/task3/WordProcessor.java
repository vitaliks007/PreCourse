package com.vitaliy.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WordProcessor {
    private static final String vowels = "уеёыаоэяиюУЕЁЫАОЭЯИЮ";

    private static int countVowel(String word) {
        return (int)word.chars().mapToObj(i -> (char)i).filter(i -> vowels.indexOf(i) != -1).count();
    }

    private static String firstVowelUp(String word) {
        char[] symbols = word.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            if (vowels.indexOf(symbols[i]) != -1) {
                symbols[i] = Character.toUpperCase(symbols[i]);
                break;
            }
        }

        return new String(symbols);
    }

    public static String process(String string) {
        return Arrays.stream(string.split(" ")).sorted(Comparator.comparing(WordProcessor::countVowel))
                .map(WordProcessor::firstVowelUp).collect(Collectors.joining(" "));
    }
}
