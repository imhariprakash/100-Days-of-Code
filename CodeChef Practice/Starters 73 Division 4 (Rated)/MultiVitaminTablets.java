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
      int days = sc.nextInt();
      int tablets = sc.nextInt();
      if (tablets >= days * 3) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
