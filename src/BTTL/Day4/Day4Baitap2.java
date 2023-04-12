package BTTL.Day4;

public class Day4Baitap2 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int[][] arr = {{3, 5, 6}, {2, 4, 8}, {1, 9, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    sum += arr[i][j];
                }if (i+j == arr.length - 1){
                    sum1 +=arr[i][arr.length-1-i];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
