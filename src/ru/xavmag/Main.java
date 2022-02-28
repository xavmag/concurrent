package ru.xavmag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws InterruptedException {
//    new TwoThreads().start();
//    new Sorting().start();
    arrayDiff(new int[] {1, 2, 2}, new int[] {1});
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    int[] tmp = new int[a.length];
    int idx = 0;
    for (int k : a) {
      for (int j = 0; j < b.length; j++) {
        if (a[j] == b[j]) {
          break;
        }
        if (j == b.length - 1) {
          tmp[idx] = k;
          idx++;
        }
      }
    }
    int[] out = new int[idx+1];
    System.arraycopy(tmp, 0, out, 0, idx+1);
    System.out.println(Arrays.toString(out));
    System.out.println(Arrays.toString(tmp));
    return out;
  }
}
