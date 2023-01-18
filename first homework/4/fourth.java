// Airidas Rupšas - JNII21

import java.util.Scanner;

public class fourth {
  private static boolean isArmstrongNumber(int n) {
    int n3 = (int)Math.pow(n % 10, 3);
    int n2 = (int)Math.pow((int)(n / 10) % 10, 3);
    int n1 = (int)Math.pow((int)(n / 100) % 10, 3);
    int nf = n1+n2+n3;
    return n == nf;
  }

    public static void main(String[] args) {
      System.out.print("Enter number: ");
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for (int i = 1; i <= n; i++) {
        if (isArmstrongNumber(i)) {
          System.out.println(i);
        }
      }
        }
  }