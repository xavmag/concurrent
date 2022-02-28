package ru.xavmag.february28;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Задача №1: Even or Odd");
    // Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    // Function EvenOrOdd(int x)

    System.out.println("Введите целое число");
    int n = sc.nextInt();
    System.out.println("Ответ: " + EvenOrOdd(n));
    System.out.println();


    System.out.println("Задача №2: Sum of positive");
    // You get an array of numbers, return the sum of all of the positives ones.
    // Function SumOfPositive(int[] array)

    System.out.println("Введите количество элементов в массиве");
    int m = sc.nextInt();
    int[] array = new int[m];
    System.out.println("Введите элементы массива (целые числа)");
    for (int i = 0; i<m; i++){
      array[i] = sc.nextInt();
      System.out.println(array[i]);
    }
    System.out.println("Ответ: " + SumOfPositive(array));
    System.out.println();

    System.out.println("Задача №3: Opposite number");
    // Very simple, given an integer or a floating-point number, find its opposite.
    // Function OppositeNumber(float y)

    System.out.println("Введите число");
    float y = sc.nextFloat();
    System.out.println("Ответ: " + OppositeNumber(y));
    System.out.println();
  }

  public static String EvenOrOdd(int x)
  {
    if (x%2 == 0)
    {
      return("Even");
    }
    else
    {
      return("Odd");
    }
  }

  public static int SumOfPositive(int[] array)
  {
    int sum = 0;
    for (int i = 0; i<array.length; i++){
      if (array[i] > 0) sum += array[i];
    }
    return sum;
  }

  public static float OppositeNumber(float y)
  {
    return (-y);
  }
}