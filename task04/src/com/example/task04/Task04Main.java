package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.ROOT); // чтобы '.' был разделителем независимо от системы
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    sum += sc.nextDouble();
                } else {
                    sc.next(); // не число — пропускаем токен
                }
            }
        }

        System.out.printf(Locale.ROOT, "%.6f%n", sum);
        System.out.flush();
    }
}
