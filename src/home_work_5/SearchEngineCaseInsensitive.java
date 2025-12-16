package home_work_5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (text == null || word == null) {
            return 0;
        }

        if (searchEngine instanceof RegExSearch) {
            return searchWithRegExCaseInsensitive(text, word);
        }

        return searchEngine.search(text.toLowerCase(), word.toLowerCase());
    }

    private long searchWithRegExCaseInsensitive(String text, String word) {
        if (word.isEmpty()) {
            return 0;
        }


        String escapedWord = Pattern.quote(word);

        String pattern = "\\b" + escapedWord + "\\b";

        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher m = p.matcher(text);

        long count = 0;
        while (m.find()) {
            count++;
        }

        return count;
    }
}