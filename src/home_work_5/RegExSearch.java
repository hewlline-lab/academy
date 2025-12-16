package home_work_5;

import java.util.regex.*;

class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }

        // Экранируем специальные символы в слове
        String escapedWord = Pattern.quote(word);
        // Ищем слово с границами
        String pattern = "\\b" + escapedWord + "\\b";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        long count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }
}