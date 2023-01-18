// Airidas Rupšas - JNII21

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
      System.out.print("Enter x1, x2, y1 and y2: ");
      Scanner in=new Scanner(System.in);
      double x1=in.nextDouble();
      double x2=in.nextDouble();
      double y1=in.nextDouble();
      double y2=in.nextDouble();
      double perimeter=2*Math.abs(x2-x1)+2*Math.abs(y2-y1);
      double area=(Math.abs(x2-x1)*Math.abs(y2-y1));


      System.out.println("Perimeter: "+perimeter);
      System.out.println("Area: "+area);
        }
  }