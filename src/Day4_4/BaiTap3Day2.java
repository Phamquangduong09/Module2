package Day4_4;
// Snt nhỏ hơn 100
//public class Baitap3 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            for (int j = 2; j <= i; j++) {
//                if (i == j) {
//                    System.out.println( i + " Là số nguyên tố ");
//                }if ( i % j ==0){
//                    break;
//                }
//            }
//        }
//
//    }
//}
//100 Snt đầu tiên
public class BaiTap3Day2 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    count++;
                    System.out.println( i + " Là số nguyên tố ");

                }if ( i % j ==0){
                    break;
                }
                if (count==100){
                    break;
                }
            }
        }

    }
}
