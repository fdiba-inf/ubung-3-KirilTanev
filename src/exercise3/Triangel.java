package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double S = 0;
        double P = 0;

        do {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();

            if ( (a + b <= c) || (b + c <= a) || (c + a <= b) ){
                System.out.println("Values are not correct!");
            }else{
                P = (a+b+c) / 2;
                S = Math.sqrt(P * (P - a) * (P-b) * (P-c));
                System.out.println("Area: " + S);
                if (a == b && a == c ){
                    System.out.println("Triangle: equilateral");
                }else if(a == b || b == c || c == a){
                    System.out.println("Triangle: isosceles");
                }else {
                    System.out.println("Triangle: scalene");
                }
            }

        }while (a > 0 && b > 00 && c > 00);

    }
}