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
      int number_of_elements = sc.nextInt();
      int expected_result = sc.nextInt();
      int arrayOR = 0;

      for (int j = 0; j < number_of_elements; j++) {
        arrayOR = arrayOR | sc.nextInt();
      }

      if (((expected_result - arrayOR) | arrayOR) == expected_result) {
        System.out.println(expected_result - arrayOR);
      } else {
        System.out.println(-1);
      }
    }
  }
}
