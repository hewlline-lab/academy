package home_work_5;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        if (word == null || word.isEmpty() || text == null) {
            return 0;
        }

        if (word.length() == 1 && !Character.isLetterOrDigit(word.charAt(0))) {
            return 0;
        }

        long count = 0;
        int index = 0;
        int wordLength = word.length();
        int textLength = text.length();

        while (index < textLength) {
            index = text.indexOf(word, index);

            if (index == -1) {
                break;
            }

            if (isWholeWord(text, index, wordLength)) {
                count++;
            }

            index += 1;
        }

        return count;
    }

    private boolean isWholeWord(String text, int start, int length) {
        int before = start - 1;
        int after = start + length;

        if (before >= 0) {
            char beforeChar = text.charAt(before);
            if (Character.isLetterOrDigit(beforeChar) || beforeChar == '-') {
                return false;
            }
        }

        if (after < text.length()) {
            char afterChar = text.charAt(after);
            if (Character.isLetterOrDigit(afterChar) || afterChar == '-') {
                return false;
            }
        }

        return true;
    }
}