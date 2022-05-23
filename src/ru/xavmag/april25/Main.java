package ru.xavmag.april25;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Task 1: Cat years, Dog years

    System.out.println("Task 1: Cat years, Dog years");
    System.out.println("Введите натуральное число");
    int y = sc.nextInt();
    int[] years = Dinglemouse.humanYearsCatYearsDogYears(y);
    System.out.println("Массив состоящий из человеческих, кошачьих и собачьих лет:");
    for (int year : years) {
      System.out.print(year + " ");
    }
    System.out.println();
    System.out.println();

    // Task 2: Write Number in Expanded Form

    System.out.println("Task 2: Write Number in Expanded Form");
    System.out.println("Введите натуральное число n");
    int x = sc.nextInt();
    System.out.println("Число n в развернутой форме:");
    System.out.println(ExpandedForm.expandedForm(x));
    System.out.println();

    // Task 3: I love you, a little , a lot, passionately ... not at all

    System.out.println("Task 3: I love you, a little , a lot, passionately ... not at all");
    System.out.println("Введите натуральное число n");
    int nb = sc.nextInt();
    System.out.println("Как сильно вас любят?:");
    System.out.println(Sid.howMuchILoveYou(y));
    System.out.println();

  }

  // Task 1: Cat years, Dog years

  public static class Dinglemouse
  {
    public static int[] humanYearsCatYearsDogYears(final int humanYears)
    {
      int cat = 0;
      int dog = 0;
      int[] years = new int[3];
      int y = humanYears;
      while (y>0)
      {
        if (cat == 0)
        {
          cat += 15;
          y -= 1;
          continue;
        }
        if (cat == 15)
        {
          cat += 9;
          y -= 1;
          continue;
        }
        if (cat >= 24)
        {
          cat += 4*y;
          y = 0;
        }
      }
      y = humanYears;
      while (y>0)
      {
        if (dog == 0)
        {
          dog += 15;
          y -= 1;
          continue;
        }
        if (dog == 15)
        {
          dog += 9;
          y -= 1;
          continue;
        }
        if (dog >= 24)
        {
          dog += 5*y;
          y = 0;
        }
      }
      return new int[] {humanYears, cat, dog};
    }
  }

  // Task 2: Write Number in Expanded Form

  public static class ExpandedForm
  {
    public static String expandedForm(int num)
    {
      int x;
      StringBuilder s = new StringBuilder();
      int n = num;
      int k = 0;
      while(n > 0)
      {
        k += 1;
        n = n/10;
      }
      k = k-1;
      n = num;
      while(n > 0)
      {
        x = (int) Math.pow(10, k);
        if (n/x > 0)
        {
          if (n < num) s.append(" + ");
          s.append((n / x) * x);
        }
        n = n%x;
        k -= 1;
      }
      return s.toString();
    }
  }

  // Task 3: I love you, a little , a lot, passionately ... not at all

  public static class Sid
  {
    public static String howMuchILoveYou(int nb_petals)
    {
      String[] answer = new String[] {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
      return answer[(nb_petals-1)%6];
    }
  }

}
