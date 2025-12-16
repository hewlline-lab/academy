package home_work_5;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WarAndPeaceAnalyzer {

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Paths.get("C:\\Users\\Tarle-PC\\Desktop\\! fdsfsdfdsfdsfdsf\\Javadsd\\HomeWork\\src\\home_work_5\\война_и_мир_книга.txt"));
        System.out.println("Размер файла: " + content.length() + " символов");

        List<String> words = splitWords(content);
        System.out.println("Слов: " + words.size());

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Уникальных слов: " + uniqueWords.size());

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nТоп 10 слов:");
        for (int i = 0; i < Math.min(10, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue() + " раз");
        }

        System.out.println("\n=== Поиск через EasySearch ===");
        ISearchEngine searcher = new EasySearch();

        String[] testWords = {"война", "и", "мир", "Война", "И"};
        System.out.println("\nЧастота слов (с учетом регистра):");
        for (String word : testWords) {
            long count = searcher.search(content, word);
            System.out.println(word + " - " + count + " раз");
        }

        System.out.println("\n=== Тесты разбиения слов ===");
        testWordSplitting();
    }

    private static List<String> splitWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c) || Character.isDigit(c)) {
                currentWord.append(c);
                inWord = true;
            } else if (c == '-') {
                if (i > 0 && i < text.length() - 1) {
                    char prev = text.charAt(i - 1);
                    char next = text.charAt(i + 1);
                    if (isWordChar(prev) && isWordChar(next)) {
                        currentWord.append(c);
                        inWord = true;
                    } else {
                        if (currentWord.length() > 0) {
                            words.add(currentWord.toString());
                            currentWord.setLength(0);
                        }
                        inWord = false;
                    }
                } else {
                    if (currentWord.length() > 0) {
                        words.add(currentWord.toString());
                        currentWord.setLength(0);
                    }
                    inWord = false;
                }
            } else {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
                inWord = false;
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        words.removeIf(word -> {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != '-') {
                    return false;
                }
            }
            return true;
        });

        return words;
    }

    private static boolean isWordChar(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    private static void testWordSplitting() {
        String[] testCases = {
                "привет, как дела!",
                "привет;как дела!",
                "как дела!.Что делаешь?",
                "Привет -привет",
                "4-х",
                "один и 1",
                "бабушка бабушке бабушку",
                "--привет --",
                "-начало",
                "конец-"
        };

        for (String test : testCases) {
            List<String> words = splitWords(test);
            System.out.println("\"" + test + "\" -> " + words + " (" + words.size() + " слов)");
        }
    }
}