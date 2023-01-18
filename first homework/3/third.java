// Airidas Rupšas - JNII21

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
//        while (true) {
        System.out.println("Enter year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int cycle = (year - 4) % 10 + 1;
        switch (cycle) {
            case 1, 2:
                System.out.println("Green year.");
                break;
            case 3, 4:
                System.out.println("Red year.");
                break;
            case 5, 6:
                System.out.println("Yellow year.");
                break;
            case 7, 8:
                System.out.println("White year.");
                break;
            case 9, 10:
                System.out.println("Black year.");
                break;
            default:
                System.out.println("Try again.");
                break;
//            }
        }
    }
}