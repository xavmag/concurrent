package ru.xavmag;

import java.io.IOException;
import java.util.Random;

public class Sorting {
    public void start() throws InterruptedException {
        var rnd = new Random();
        System.out.println("Подготовка данных");
        int[] input = new int[10000];
        for (int i = 0; i < input.length; i++) {
            input[i] = rnd.nextInt();
        }
        var part1 = new int[input.length / 2];
        var part2 = new int[input.length / 2];
        System.arraycopy(input, 0, part1,0, 5000);
        System.arraycopy(input, input.length / 2, part2, 0, 5000);
        System.out.println("Сортировка без потоков: ");
        var time = System.currentTimeMillis();
        sort(input);
        System.out.println("Время: " + (System.currentTimeMillis() - time) + " мс");
        System.out.println("Сортировка с потоками: ");
        time = System.currentTimeMillis();
        var t1 = new Thread(() -> sort(part1));
        var t2 = new Thread(() -> sort(part2));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        int[] sorted = merge(part1, part2);
        System.out.println("Время: " + (System.currentTimeMillis() - time) + " мс");
    }

    private void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }
            var tmp = array[minPos];
            array[minPos] = array[i];
            array[i] = tmp;
        }
    }

    private int[] merge(int[] part1, int[] part2) {
        var out = new int[part1.length + part2.length];
        for (int i = 0, j = 0, k = 0; k < out.length; k++) {
            if (i >= part1.length) {
                out[k] = part2[j];
                j++;
                continue;
            }
            if (part1[i] < part2[j]) {
                out[k] = part1[i];
                i++;
            } else {
                out[k] = part2[j];
                j++;
            }
        }
        return out;
    }
}
