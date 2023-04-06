package Day6_4;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        System.out.println("Nhập số b");
        int b = scanner.nextInt();
        System.out.println("Nhập số c");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        int delta = quadraticEquation.getDiscriminant();
        if( delta > 0){
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        }else if ( delta == 0){
            System.out.println(quadraticEquation.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
    int a;
    int b;
    int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt((b * b) - 4 * a * c))/ (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
    }
}
