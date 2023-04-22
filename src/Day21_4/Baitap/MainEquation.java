package Day21_4.Baitap;

import java.util.Scanner;

public class MainEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SolveTheEquation solveTheEquation = new SolveTheEquation();
        while (true) {
            System.out.println(" 1.Equation");
            System.out.println(" 2.Quadratic equation 2");
            System.out.println("What are your options?");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter number a");
                    double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number b");
                    double b = Double.parseDouble(scanner.nextLine());
                    solveTheEquation.equation(a, b);
                    break;
                case 2:
                    System.out.println("Enter number a");
                    double a1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number b");
                    double b1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number c");
                    double c1 = Double.parseDouble(scanner.nextLine());
                    solveTheEquation.quadraticEquation2(a1, b1, c1);
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}
