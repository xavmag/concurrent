package ru.xavmag.april18;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Task 1: Lario and Muigi Pipe Problem

    System.out.println("Task 1: Lario and Muigi Pipe Problem");
    System.out.println("Введите отсортированный по возрастанию массив целых чисел");
    String[] str = sc.nextLine().split(" ");
    int[] r = new int[str.length];
    for (int i = 0; i < str.length; i++)
    {
      r[i] = Integer.parseInt(str[i]);
    }
    System.out.println("Массив со всеми недостающими элементами:");
    int[] res = PipeFix.pipeFix(r);
    for (int re : res) {
      System.out.print(re + " ");
    }
    System.out.println();
    System.out.println();

    // Task 2: Bit Counting

    System.out.println("Task 2: Bit Counting");
    System.out.println("Введите натуральное число");
    int x = sc.nextInt();
    System.out.print("Количество единиц в двоичном представлении этого числа = ");
    System.out.print(BitCounting.countBits(x));
    System.out.println();
    System.out.println();

    // Task 3: Playing with digits

    System.out.println("Task 3: Playing with digits");
    System.out.println("Введите натуральное число n");
    int n = sc.nextInt();
    System.out.println("Введите натуральное число p");
    int p = sc.nextInt();
    System.out.println("Существует ли целое число k, такое как: (a ^ p + b ^ (p+1) + c ^ (p+2) + d ^ (p+3) + ...) = n * k ?");
    System.out.println(DigPow.digPow(n, p));
    System.out.println();

  }

  // Task 1: Lario and Muigi Pipe Problem

  public static class PipeFix
  {
    public static int[] pipeFix(int[] numbers)
    {
      int[] res = new int[numbers[numbers.length-1] - numbers[0] + 1];
      int k = 0;
      for (int i=numbers[0]; i<=numbers[numbers.length-1]; i++)
      {
        res[k] = i;
        k += 1;
      }
      return res;
    }
  }

  // Task 2: Bit Counting

  public static class BitCounting
  {
    public static int countBits(int n)
    {
      int k = 0;
      while (n>0)
      {
        k += n%2;
        n = n/2;
      }
      return k;
    }
  }

  // Task 3: Playing with digits

  public static class DigPow
  {
    public static long digPow(int n, int p)
    {
      int m = n;
      int k;
      int sum = 0;
      int l = 0;
      while(m>0)
      {
        m = m/10;
        l += 1;
      }
      p += l-1;
      m = n;
      while(m>0)
      {
        k = 1;
        for (int i=1; i<=p; i++) k *= m%10;
        sum += k;
        m = m/10;
        p -= 1;
      }
      if (sum % n == 0) return (sum/n);
      else return -1;
    }
  }

}
