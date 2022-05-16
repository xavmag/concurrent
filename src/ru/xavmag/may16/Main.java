package ru.xavmag.may16;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Task 1: Word a10n (abbreviation)

    System.out.println("Task 1: Word a10n (abbreviation)");
    System.out.println("Введите несколько слов через пробел");
    Scanner sc1 = new Scanner(System.in);
    String s = sc1.nextLine();
    System.out.println("Аббревиатуры слов из вашей строки:");
    System.out.println(Abbreviator.abbreviate(s));
    System.out.println();

    // Task 2: Triangular Treasure

    System.out.println("Task 2: Triangular Treasure");
    System.out.println("Введите целое число n");
    long n = sc.nextLong();
    System.out.println("n-ое треугольное число:");
    System.out.println(Triangular.triangular(n));
  }

  // Task 1: Word a10n (abbreviation)

  public static class Abbreviator
  {
    public static String abbreviate(String string)
    {
      String[] words = string.split(" ");
      StringBuilder res = new StringBuilder();
      String s = "";
      for (String word : words) {
        s = word;
        if (!res.toString().equals("")) res.append(" ");
        res.append(s.charAt(0));
        res.append(s.length() - 2);
        res.append(s.charAt(s.length() - 1));
      }
      return res.toString();
    }
  }

  // Task 2: Triangular Treasure

  public static class Triangular
  {
    public static long triangular(long n)
    {
      if (n <= 0) return 0;
      return(n*(n+1)/2);
    }
  }

}
