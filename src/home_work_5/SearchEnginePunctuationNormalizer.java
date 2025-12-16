package home_work_5;

import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    private Pattern punctuationPattern = Pattern.compile("[\\p{Punct}]");

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (text == null || word == null) {
            return 0;
        }

        String normalizedText = normalizeText(text);

        return searchEngine.search(normalizedText, word);
    }

    private String normalizeText(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String result = punctuationPattern.matcher(text).replaceAll(" ");

        result = result.replaceAll("\\s+", " ");

        return result.trim();
    }
}