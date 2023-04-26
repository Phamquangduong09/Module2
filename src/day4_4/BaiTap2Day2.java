package day4_4;

public class BaiTap2Day2 {
        public static void main(String[] args) {
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
                if (count == 20) {
                    break;
                }
            }

            System.out.println("Tổng 20 số nguyên tố đầu tiên là :" + sum);
        }
    }

