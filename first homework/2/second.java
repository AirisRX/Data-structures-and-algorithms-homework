// Airidas Rupšas - JNII21

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
      final int first_year = 1896;
      System.out.print("Enter year: ");
      Scanner in=new Scanner(System.in);
      int year=in.nextInt();

      if (year >= first_year && year % 4 == 0) {
        int count = (year - first_year) / 4 + 1;
        System.out.println(year + " is an olympic year. The number is: " + count);
      }
      else {
        System.out.println(year + " is not an olympic year");
      }
        }
  }