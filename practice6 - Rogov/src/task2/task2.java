package task2;

import task3.Massi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {

    public static void quickSort (Comparable[] list, int leftBorder, int rightBorder) {
        Comparable temp;

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        temp = list[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (list[leftMarker].compareTo(temp) < 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (list[rightMarker].compareTo(temp) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Comparable tmp = list[leftMarker];
                    list[leftMarker] = list[rightMarker];
                    list[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(list, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(list, leftBorder, rightMarker);
        }
    }


    public task2() {
        List<Student> li = new ArrayList<>();
        li.add(new Student(15, "A"));
        li.add(new Student(12, "A"));
        li.add(new Student(27, "A"));
        li.add(new Student(7, "A"));
        li.add(new Student(95, "A"));
        li.add(new Student(11, "A"));

        System.out.println("-------до сортировки--------");
        for (Student u : li) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");

        Collections.sort(li);

        for (Student u : li) {
            System.out.println(u);
        }

    }
}
