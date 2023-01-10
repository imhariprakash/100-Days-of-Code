/*
 Problem
###Read problems statements Mandarin , Bengali , Hindi , Russian and Vietnamese as well.

Chef had a sequence of positive integers with length N + KN+K. He managed to calculate the arithmetic average of all elements of this sequence (let's denote it by VV), but then, his little brother deleted KK elements from it. All deleted elements had the same value.

Chef still knows the remaining NN elements — a sequence A_1, A_2, \ldots, A_NA 
1
​
 ,A 
2
​
 ,…,A 
N
​
 . Help him with restoring the original sequence by finding the value of the deleted elements or deciding that there is some mistake and the described scenario is impossible.

Note that the if it is possible for the deleted elements to have the same value, then it can be proven that it is unique. Also note that this value must be a positive integer.

Input
The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
The first line of each test case contains three space-separated integers NN, KK and VV.
The second line contains NN space-separated integers A_1, A_2, \ldots, A_NA 
1
​
 ,A 
2
​
 ,…,A 
N
​
 .
Output
For each test case, print a single line containing one integer — the value of the deleted elements, or -1−1 if there is a mistake.

Constraints
1 \le T \le 1001≤T≤100
1 \le N, K \le 1001≤N,K≤100
1 \le V \le 10^51≤V≤10 
5
 
1 \le A_i \le 10^51≤A 
i
​
 ≤10 
5
  for each valid ii
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
3 3 4
2 7 3
3 1 4
7 6 5
3 3 4
2 8 3

output :

4
-1
-1
 */
import java.util.Scanner;

class AverageNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count, n, k, v, temp_answer, answer;
    count = sc.nextInt();

    for (int i = 0; i < count; i++) {
      answer = 0;
      temp_answer = 0;
      n = sc.nextInt();
      k = sc.nextInt();
      v = sc.nextInt();

      for (int j = 0; j < n; j++) {
        answer += sc.nextInt();
      }

      temp_answer = (n + k) * v - answer;

      if (temp_answer % k == 0 && temp_answer / k > 0) {
        System.out.println(temp_answer / k);
      } else {
        System.out.println(-1);
      }
      sc.close();
    }
  }
}
