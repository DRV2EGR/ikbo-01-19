package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void selectionSort (Comparable[] list) {
        int left;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            left = index;
            temp = list[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (temp.compareTo(list[i]) < 0 ) {
                    list[i + 1] = list[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list[i + 1] = temp;
        }
    }

    public task3()
    {
        List<Massi> li = new ArrayList<>();
        li.add(new Massi(15));
        li.add(new Massi(12));
        li.add(new Massi(27));
        li.add(new Massi(7));
        li.add(new Massi(95));
        li.add(new Massi(11));

        System.out.println("-------до сортировки--------");
        for (Massi u : li) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");

        Collections.sort(li);

        for (Massi u : li) {
            System.out.println(u);
        }

    }
}
