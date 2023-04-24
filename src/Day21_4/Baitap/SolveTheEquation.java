package Day21_4.Baitap;

import java.util.Scanner;

public class SolveTheEquation {
    Scanner scanner = new Scanner(System.in);

    void equation(double a, double b) {

        try {
            if (a == 0) {
                throw new IllegalArgumentException(" The equation has no solution ");
            }else if (a== 0 && b==0){
                throw new IllegalArgumentException(" Equation with infinite solutions ");
            }else {
                double x = -b / a;
                System.out.println("Equation" + a + "x + " + b + " = 0 là: " + x);
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    void quadraticEquation2(double a, double b, double c) {
        try {
            double delta = Math.pow(b, 2) -( 4 * a * c);

            if (delta < 0) {
                throw new Exception(" The equation has no solution! ");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Equation has 2 solutions x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Equation has 2 solutions");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        } catch (Exception e) {
            System.out.println("Error  :" + e.getMessage());
        }
    }
}


