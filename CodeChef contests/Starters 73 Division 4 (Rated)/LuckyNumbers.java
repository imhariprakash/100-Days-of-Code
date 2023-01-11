/* package codechef; // don't place package name! */

import java.io.*;
import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    for (int i = 0; i < count; i++) {
      int number = sc.nextInt();
      while (number != 0) {
        if (number % 10 == 7) {
          System.out.println("YES");
          break;
        }
        number = number / 10;
        if (number == 0) {
          System.out.println("NO");
        }
      }
    }
  }
}
