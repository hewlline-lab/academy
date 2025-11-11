package home_work_4.api;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        if (data == null) {
            this.data = (T[]) new Object[0];
        } else {
            this.data = data;
        }
    }

    public int add(T item) {
        if (item == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public T[] getItems() {
        return data;
    }

    public T get(int index) {
        if (index < 0) {
            return null;
        }
        if (index >= data.length) {
            return null;
        }
        return data[index];
    }

    public boolean delete(int index) {
        if (index < 0) {
            return false;
        }
        if (index >= data.length) {
            return false;
        }

        T[] newData = Arrays.copyOf(data, data.length - 1);
        int newIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                newData[newIndex] = data[i];
                newIndex++;
            }
        }
        data = newData;
        return true;
    }

    public boolean delete(T item) {
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (item.equals(data[i])) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                T first = data[j];
                T second = data[j + 1];
                int result = comparator.compare(first, second);
                if (result > 0) {
                    data[j] = second;
                    data[j + 1] = first;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        T[] data = container.data;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                T first = data[j];
                T second = data[j + 1];
                if (first.compareTo(second) > 0) {
                    data[j] = second;
                    data[j + 1] = first;
                }
            }
        }
    }

    @Override
    public String toString() {
        if (data.length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();
        result.append("[");

        boolean foundFirst = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (foundFirst) {
                    result.append(", ");
                }
                result.append(data[i]);
                foundFirst = true;
            }
        }

        result.append("]");
        return result.toString();
    }
}