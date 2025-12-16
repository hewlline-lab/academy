package home_work_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchEngineTest {

    @Test
    public void testEasySearch() {
        ISearchEngine searcher = new EasySearch();

        assertEquals(1, searcher.search("привет, как дела!", "привет"));
        assertEquals(1, searcher.search("привет, как дела!", "дела"));
        assertEquals(0, searcher.search("привет,какдела!", "дела")); // "дела" часть "какдела"
        assertEquals(1, searcher.search("Привет-привет", "Привет-привет"));
        assertEquals(1, searcher.search("4-х", "4-х"));

        assertEquals(0, searcher.search("Мама мыла раму", "мыл"));
        assertEquals(2, searcher.search("раз раз два", "раз"));
        assertEquals(0, searcher.search("разработать", "раз"));
        assertEquals(1, searcher.search("раз-два", "раз-два"));
    }

    @Test
    public void testRegExSearch() {
        ISearchEngine searcher = new RegExSearch();

        assertEquals(1, searcher.search("привет, как дела!", "привет"));
        assertEquals(1, searcher.search("привет, как дела!", "дела"));
        assertEquals(0, searcher.search("привет,какдела!", "дела"));
        assertEquals(1, searcher.search("Привет-привет", "Привет-привет"));
        assertEquals(1, searcher.search("4-х", "4-х"));
        assertEquals(0, searcher.search("разработать", "раз"));
    }

    @Test
    public void testCaseInsensitive() {
        ISearchEngine baseSearcher = new EasySearch();
        ISearchEngine caseInsensitiveSearcher = new SearchEngineCaseInsensitive(baseSearcher);

        assertEquals(1, caseInsensitiveSearcher.search("Привет мир", "привет"));
        assertEquals(1, caseInsensitiveSearcher.search("привет мир", "Привет"));
        assertEquals(2, caseInsensitiveSearcher.search("Привет привет", "привет"));
        assertEquals(1, caseInsensitiveSearcher.search("ВОЙНА И МИР", "война"));
    }

    @Test
    public void testPunctuationNormalizer() {
        ISearchEngine baseSearcher = new EasySearch();
        ISearchEngine normalizedSearcher = new SearchEnginePunctuationNormalizer(baseSearcher);

        assertEquals(0, normalizedSearcher.search("привет,какдела!", "дела"));

        assertEquals(1, normalizedSearcher.search("как дела!.Что делаешь?", "делаешь"));

        assertEquals(1, normalizedSearcher.search("привет;какдела!", "привет"));
    }

    @Test
    public void testComplexCases() {
        ISearchEngine searcher = new EasySearch();

        assertEquals(1, searcher.search("сегодня - завтра", "сегодня"));
        assertEquals(1, searcher.search("сегодня - завтра", "завтра"));

        assertEquals(1, searcher.search("вариант 1 и вариант 2", "1"));
        assertEquals(1, searcher.search("вариант 1 и вариант 2", "2"));

        assertEquals(2, searcher.search("слово    слово", "слово"));

        assertEquals(0, searcher.search("", "слово"));
        assertEquals(0, searcher.search("текст", ""));
        assertEquals(0, searcher.search("", ""));
    }

    @Test
    public void testCombinedDecorators() {
        ISearchEngine searcher = new SearchEngineCaseInsensitive(
                new SearchEnginePunctuationNormalizer(
                        new EasySearch()
                )
        );

        assertEquals(1, searcher.search("Привет,КакДела!", "привет"));
        assertEquals(1, searcher.search("Привет;КакДела!", "какдела"));
        assertEquals(2, searcher.search("Раз.Два.Раз", "раз"));
    }

    @Test
    public void testEdgeCases() {
        ISearchEngine searcher = new EasySearch();

        assertEquals(1, searcher.search("какой-то текст", "какой-то"));
        assertEquals(0, searcher.search("какой то текст", "какой-то"));

        assertEquals(0, searcher.search("слово - слово", "-"));

        assertEquals(1, searcher.search("don't worry", "don't"));

        assertEquals(1, searcher.search("test тест", "test"));
        assertEquals(1, searcher.search("test тест", "тест"));
    }
}