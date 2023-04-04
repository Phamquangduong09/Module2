package Day5_4;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2Day3 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 1, 7, 9};
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí index:");
        int index = scanner.nextInt();
        System.out.print("Nhập số muốn thêm :");
        int x = scanner.nextInt();
        if (index <= -1 || index > arr.length - 1) {
            System.out.print(Arrays.toString(arr));
        }
        else {
            for (int i = 0; i < arr.length+1; i++) {
                   if(index > i){
                       array[i] = arr[i];
                   }
                   else if(index == i){
                       array[i] = x;
                   }
                   else {
                       array[i] = arr[i-1];
                   }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
