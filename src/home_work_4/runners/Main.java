package home_work_4.runners;

import home_work_4.api.DataContainer;
import home_work_4.comparators.StringLengthComparator;
import home_work_4.comparators.StringAlphabeticComparator;
import home_work_4.comparators.IntegerComparator;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. ПРИМЕРЫ ИЗ ЗАДАНИЯ:");
        String[] initialArray = new String[0];
        DataContainer<String> container = new DataContainer<>(initialArray);

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);

        System.out.println("текст 1: " + text1);
        System.out.println("текст 2: " + text2);
        System.out.println("текст 3: " + text3);
        System.out.println("текст 4: " + text4);

        container.delete(text1);

        System.out.println("После удаления 'Привет': " + container.get(index1));

        container.sort(new StringLengthComparator());
        System.out.println("По длине: " + container);

        container.sort(new StringAlphabeticComparator());
        System.out.println("По алфавиту: " + container);

        System.out.println("\n2. ДОБАВЛЕНИЯ И РАСШИРЕНИЯ:");
        Integer[] numbers = new Integer[2];
        DataContainer<Integer> numberContainer = new DataContainer<>(numbers);

        System.out.println("Начальный массив: " + java.util.Arrays.toString(numberContainer.getItems()));
        int idx1 = numberContainer.add(10);
        int idx2 = numberContainer.add(20);
        int idx3 = numberContainer.add(30);
        System.out.println("Индексы: " + idx1 + ", " + idx2 + ", " + idx3);
        System.out.println("После добавления: " + java.util.Arrays.toString(numberContainer.getItems()));

        System.out.println("\n3. ДОБАВЛЕНИЯ NULL:");
        int nullIndex = numberContainer.add(null);
        System.out.println("Результат: " + nullIndex);

        System.out.println("\n4. УДАЛЕНИЯ ПО ИНДЕКСУ:");
        System.out.println("До удаления: " + numberContainer);
        boolean deleteResult1 = numberContainer.delete(1);
        System.out.println("Удаление индекса 1: " + deleteResult1);
        System.out.println("После: " + numberContainer);

        boolean deleteResult2 = numberContainer.delete(10);
        System.out.println("Удаление индекса 10: " + deleteResult2);

        System.out.println("\n5. УДАЛЕНИЯ ПО ЗНАЧЕНИЮ:");
        System.out.println("До удаления: " + numberContainer);
        boolean deleteValue1 = numberContainer.delete(30);
        System.out.println("Удаление значения 30: " + deleteValue1);
        System.out.println("После удаления: " + numberContainer);

        boolean deleteValue2 = numberContainer.delete(999);
        System.out.println("Удаление значения 999: " + deleteValue2);

        boolean deleteValue3 = numberContainer.delete(null);
        System.out.println("Удаление null: " + deleteValue3);

        System.out.println("\n6. СОРТИРОВКИ ЧИСЕЛ:");
        Integer[] unsortedNumbers = {5, 1, 8, 2, 7};
        DataContainer<Integer> unsortedContainer = new DataContainer<>(unsortedNumbers);
        System.out.println("До сортировки: " + unsortedContainer);
        unsortedContainer.sort(new IntegerComparator());
        System.out.println("После сортировки: " + unsortedContainer);

        System.out.println("\n7. СТАТИЧЕСКОЙ СОРТИРОВКИ:");
        Integer[] comparableNumbers = {9, 3, 6, 1, 4};
        DataContainer<Integer> comparableContainer = new DataContainer<>(comparableNumbers);
        System.out.println("До статической сортировки: " + comparableContainer);
        DataContainer.sort(comparableContainer);
        System.out.println("После статической сортировки: " + comparableContainer);

        System.out.println("\n8. СОРТИРОВКИ СТРОК ПО ДЛИНЕ:");
        String[] strings = {"i", "hello", "1", "Как домашка"};
        DataContainer<String> stringContainer = new DataContainer<>(strings);
        System.out.println("До сортировки: " + stringContainer);
        stringContainer.sort(new StringLengthComparator());
        System.out.println("Сортировки по длине: " + stringContainer);

        System.out.println("\n9. toString С NULL:");
        String[] withNulls = {"A", null, "B", "C", null, "D"};
        DataContainer<String> nullContainer = new DataContainer<>(withNulls);
        System.out.println("Массив с null: " + java.util.Arrays.toString(withNulls));
        System.out.println("toString(): " + nullContainer);

        System.out.println("\n10. ПУСТОГО КОНТЕЙНЕРА:");
        String[] emptyArray = new String[0];
        DataContainer<String> emptyContainer = new DataContainer<>(emptyArray);
        System.out.println("Пустой контейнер: " + emptyContainer);
        System.out.println("get(0) из пустого: " + emptyContainer.get(0));
    }
}