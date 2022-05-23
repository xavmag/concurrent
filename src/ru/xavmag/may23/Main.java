package ru.xavmag.may23;

import java.util.Scanner;

public class Main {
  static int twiceAsOld(int dadYears, int sonYears){
      int i=0;
      if (dadYears<sonYears*2){
        while ((dadYears-i)!=(sonYears-i)*2)
          i++;
      }
      else {
        while ((dadYears+i)!=(sonYears+i)*2)
          i++;
      }
      return i;

  }

  // Task 2: If it is a square, return its area. If it is a rectangle, return its perimeter.

  public static int areaOrPerimeter(int length, int width) {
    if(length==width){
      return length*width;
    }
    else return 2*length+2*width;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Task 1: Calculate how many years ago the father was twice as old as his son.

    System.out.println("Task 3: I love you, a little , a lot, passionately ... not at all");
    System.out.println("Введите возрасты отца и сына:");
    int dy = sc.nextInt();
    int sy = sc.nextInt();
    int dif = twiceAsOld(dy, sy);
    if (dy < sy*2) {
      System.out.print("Отец был старше сына в 2 раза ");
      System.out.print(dif);
      System.out.println(" лет назад.");
    } else {
      System.out.print("Отец будет старше сына в 2 раза через ");
      System.out.print(dif);
      System.out.println(" лет.");
    }

    // Task 2: If it is a square, return its area. If it is a rectangle, return its perimeter.

    System.out.println("Введите длину:");
    int l = sc.nextInt();
    System.out.println("Введите ширину:");
    int w = sc.nextInt();
    System.out.println();
    int result = areaOrPerimeter(l, w);
    if (l == w) {
      System.out.print("Площадь равна ");
    }
    else {
      System.out.print("Периметр равен ");
    }
    System.out.println(result);
  }
}
