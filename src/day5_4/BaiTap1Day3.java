package day5_4;

import java.util.Scanner;

public class BaiTap1Day3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 1, 7, 9};
        int [] array = new int[6];
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]) {
                array[j]= arr[i];
                 j +=1;
            }
        }
        for ( int i = 0 ; i < j ; i++){
            System.out.println(array[i]);
        }
    }
}
