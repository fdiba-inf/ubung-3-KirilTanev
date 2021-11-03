package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle;
        char ch;
        double radians;
        double degrees;
        do {
            angle = input.nextDouble();
            ch = input.next().charAt(0);
            if (ch == 'r') {
                radians = angle;
                degrees = (180*radians)/Math.PI;
                System.out.println("Angle: " + degrees + "d");
            } else if (ch == 'd') {
                degrees = angle;
                radians = (Math.PI*degrees)/180;
                System.out.println("Angle: " + radians + "r");
            }

        } while(ch == 'r' || ch == 'd');
    }
}