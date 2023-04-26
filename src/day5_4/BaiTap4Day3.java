package day5_4;
//Giá  trị lớn nhất
//public class BaiTap4Day3 {
//    public static void main(String[] args) {
//        int [][] arr = {{1,5,7,8},{47,50,698,1}};
//        int max = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max){
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}
//Giá trị nhỏ nhất
public class BaiTap4Day3 {
    public static void main(String[] args) {
        int [][] arr = {{1,5,7,8},{47,50,698,2}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
