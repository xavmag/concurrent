package ru.xavmag.march21;

import java.util.Objects;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Task 1: If you can't sleep, just count sheep!!
    System.out.println("Task 1: If you can't sleep, just count sheep!!");
    System.out.println("Введите количество овечек (положительное целое число)");
    int sheepCount = sc.nextInt();
    System.out.println("Если не можете уснуть произнесите следующий текст:");
    System.out.println(CountingSheeps.countingSheep(sheepCount));
    System.out.println();

    // Task 2: Jaden Casing Strings
    System.out.println("Task 2: Jaden Casing Strings");
    System.out.println("Введите строку");
    Scanner s = new Scanner(System.in);
    String l = s.nextLine();
    System.out.println("Строка в стиле Джейдена Смита:");
    System.out.println(JadenCase.toJadenCase(l));
    System.out.println();

    // Task 3: You're a square!
    System.out.println("Task 3: You're a square!");
    System.out.println("Введите целое число");
    int n = sc.nextInt();
    System.out.println("Это число является точным квадратом?");
    System.out.println(Square.isSquare(n));
    System.out.println();
  }


// Task 1: If you can't sleep, just count sheep!!

  public static class CountingSheeps {
    public static String countingSheep(int n) {
      StringBuilder res = new StringBuilder();
      for (int i = 1; i < n + 1; i++) {
        res.append(i).append(" sheep...");
      }
      return res.toString();
    }
  }

// Task 2: Jaden Casing Strings

  public static class JadenCase {
    public static String toJadenCase(String phrase) {
      if (Objects.equals(phrase, "") || phrase == null) return null;
      String[] words = phrase.split(" ");
      StringBuilder res = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
        res.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1, words[i].length()));
        if (i < words.length - 1) res.append(" ");
      }
      return res.toString();
    }
  }

// Task 3: You're a square!

  public static class Square {
    public static boolean isSquare(int n) {
      if (n < 0) return false;
      if (n == 0) return true;
      for (int i = 1; i < (int) Math.sqrt(n) + 1; i++) {
        if (n == i * i) return true;
      }
      return false;
    }
  }
}
