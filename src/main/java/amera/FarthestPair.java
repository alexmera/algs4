package amera;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class FarthestPair {

  private FarthestPair() {}

  public static void sorted(int[] a) {
    StdOut.println("Sorted algorithm");
    Stopwatch timer = new Stopwatch();
    Arrays.sort(a);
    int n = a.length;
    int[] pairIdx = {0, n - 1};
    int greaterDiff = Math.abs(a[pairIdx[0]] - a[pairIdx[1]]);
    StdOut.printf("(%d, %d) = %d\n", a[pairIdx[0]], a[pairIdx[1]], greaterDiff);
    StdOut.println("Sorted - elapsed time = " + timer.elapsedTime());
  }

  public static void bruteForce(int[] a) {
    StdOut.println("Brute force algorithm");
    Stopwatch timer = new Stopwatch();
    int n = a.length;
    int greaterDiff = Integer.MIN_VALUE;
    int[] pairIdx = {-1, -1};
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int diff = Math.abs(a[i] - a[j]);
        if (diff > greaterDiff) {
          greaterDiff = diff;
          pairIdx[0] = i;
          pairIdx[1] = j;
        }
      }
    }
    StdOut.printf("(%d, %d) = %d\n", a[pairIdx[0]], a[pairIdx[1]], greaterDiff);
    StdOut.println("Brute force - elapsed time = " + timer.elapsedTime());
  }

  public static void main(String[] args) {
    In in = new In(args[0]);
    int[] a = in.readAllInts();
    StdOut.printf("FarthestPair with N=%d\n", a.length);
    //bruteForce(a);
    StdOut.println("-----");
    sorted(a);
  }
}
