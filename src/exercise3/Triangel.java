package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double P = 0.0;
        double S = 0.0;
        double a;
        double b;
        double c;


        do{
           a = input.nextDouble();
           b = input.nextDouble();
           c = input.nextDouble();
          if((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Values are not correct!");
          } else {
          P = (a + b + c) / 2;
          S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
          System.out.println("Area: " + S);
          if(a == b && a == c) {
            System.out.println("Triangle: equilateral");
          } else if(a == b || a == c || b == c) {
            System.out.println("Triangle: isosceles");
          } else {
            System.out.println("Triangle: scalene");
          }
          }

        }
          while(a > 0 && b > 0 && c > 0);
        
        
          
        
    }

}