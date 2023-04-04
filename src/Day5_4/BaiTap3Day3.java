package Day5_4;

import java.util.Arrays;

public class BaiTap3Day3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 4};
        int[] arr1 = {2, 7, 8, 4};
        int[] array = new int[8];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        for (int j = arr.length; j < array.length ; j++) {
                array[j]=arr1[k];
                k++;
            }
        System.out.println(Arrays.toString(array));
        }
    }
