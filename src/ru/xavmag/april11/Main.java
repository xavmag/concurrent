package ru.xavmag.april11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    // Task 1: Sum of Digits / Digital Root

    System.out.println("Task 1: Sum of Digits / Digital Root");
    System.out.println("Введите неотрицательное целое число n");
    int n = sc.nextInt();
    int dr = DRoot.digital_root(n);
    System.out.println("Цифровой корень n = " + dr);
    System.out.println();

    // Task 2: Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

    System.out.println("Task 2: Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!");
    System.out.println("Введите левую границу интервала (неотрицательное целое число)");
    long a = sc.nextLong();
    System.out.println("Введите правую границу интервала (неотрицательное целое число)");
    long b = sc.nextLong();
    List<Long> list = SumDigPower.sumDigPow(a, b);
    for (Long aLong : list) {
      System.out.print(aLong + " ");
    }
    System.out.println();
    System.out.println();


    // Task 3: Multiples of 3 or 5

    System.out.println("Task 3: Multiples of 3 or 5");
    System.out.println("Введите целое число n");
    int x = sc.nextInt();
    System.out.print("Сумма натуральных чисел меньших n и делящихся на 3 или на 5 = ");
    System.out.print(Solution.solution(x));
    System.out.println();

  }


  // Task 1: Sum of Digits / Digital Root

  public static class DRoot
  {
    public static int digital_root(int n)
    {
      int k = 0;
      while (n>=10)
      {
        while (n>0)
        {
          k += n%10;
          n = n/10;
        }
        n = k;
        k = 0;
      }
      return n;
    }
  }

  // Task 2: Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

  static class SumDigPower
  {
    public static List<Long> sumDigPow(long a, long b)
    {
      long j;
      long k;
      long sum;
      long p;
      List<Long> list = new LinkedList<>();
      for (long i=a; i<=b; i++)
      {
        j = i;
        k = 0;
        sum = 0;
        while(j>0)
        {
          j = j/10;
          k += 1;
        }
        j=i;
        while(j>0)
        {
          p = 1;
          for (long t=1; t<=k; t++) p *= j%10;
          sum +=p;
          j = j/10;
          k -= 1;
        }
        if (i == sum) list.add(sum);
      }
      return list;
    }
  }

  // Task 3: Multiples of 3 or 5

  public static class Solution
  {
    public static int solution(int number)
    {
      if (number <= 0) return 0;
      int sum = 0;
      for (int i=1; i<number; i++)
      {
        if (i%3 == 0 || i%5 == 0) sum += i;
      }
      return sum;
    }
  }
}
