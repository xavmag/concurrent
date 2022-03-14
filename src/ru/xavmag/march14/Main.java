package ru.xavmag.march14;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Task 1: Points of Reflection

    System.out.println("Task 1: Points of Reflection");
    System.out.println("Введите через пробел целочисленные координаты точки P");
    String[] ps = sc.nextLine().split(" ");
    int p[] = new int[ps.length];
    for (int i = 0; i < ps.length; i++) {
      p[i] = Integer.parseInt(ps[i]);
    }
    System.out.println("Введите через пробел целочисленные координаты точки Q");
    String[] qs = sc.nextLine().split(" ");
    int q[] = new int[qs.length];
    for (int i = 0; i < qs.length; i++)
    {
      q[i] = Integer.parseInt(qs[i]);
    }
    System.out.println("Координаты точки P1, симметричной точке P относительно точки Q:");
    int[] p1 = PointsOfReflection.reflectPoint(p, q);
    for (int i = 0; i < p1.length; i++)
    {
      System.out.print(p1[i]);
      if (i < p1.length-1) System.out.print(" ");
    }
    System.out.println();
    System.out.println();

    // Task 2: Count Odd Numbers below n

    System.out.println("Task 2: Count Odd Numbers below n");
    System.out.println("Введите целое положительное число");
    int num = sc.nextInt();
    System.out.println("Количество положительных нечетных чисел до заданного чила (не включительно):");
    System.out.println(CountOddNumbers.oddCount(num));
    System.out.println();

    // Task 3: Sentence Smash

    Scanner s = new Scanner(System.in);
    System.out.println("Task 3: Sentence Smash");
    System.out.println("Введите несколько слов через ЗАПЯТУЮ");
    String[] l = s.nextLine().split(",");
    System.out.println("Стока состоящая из этих слов, записанных через пробел");
    System.out.println(SmashWords.smash(l));
    System.out.println();
  }



// Task 1: Points of Reflection

  public static class PointsOfReflection
  {
    public static int[] reflectPoint(int[] p, int[] q) {
      int[] p1 = new int[p.length];
      for (int i = 0; i<p.length; i++){
        p1[i] = 2*q[i] - p[i];
      }
      return p1;
    }
  }

// Task 2: Count Odd Numbers below n

  public static class CountOddNumbers {
    public static int oddCount(int n)
    {
      int count = n/2;
      return count;
    }
  }

// Task 3: Sentence Smash

  public static class SmashWords {

    public static String smash(String... words) {
      int n = words.length;
      StringBuilder res = new StringBuilder();
      if (n == 0) return res.toString();
      for (int i = 0; i<n - 1; i++){
        res.append(words[i]);
        res.append(' ');
      }
      res.append(words[n - 1]);
      return res.toString();
    }
  }

}
