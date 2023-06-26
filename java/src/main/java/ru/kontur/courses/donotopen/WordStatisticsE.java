package ru.kontur.courses.donotopen;

import ru.kontur.courses.WordStatisticImpl;

public class WordStatisticsE extends WordStatisticImpl {
    @Override
    public void addWord(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.length() > 10) word = word.substring(0, 10);
        var lowerWord = word.toLowerCase();

        statistics.put(lowerWord, 1 + statistics.getOrDefault(lowerWord, 0));
    }
}
