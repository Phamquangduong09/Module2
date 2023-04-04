package BTTL;

import java.util.Scanner;

public class Baitap4Day1 {
    public static void main(String[] args) {
        loop();
    }

    static void loop() {
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    count += 1;
                    sum += i;
                }
                if (i % j == 0) {
                    break;
                }
            }
            if (count == number) {
                break;
            }
        }
        System.out.println("Tổng " +number+ " số nguyên tố đầu tiên là :" + sum);
    }
}

