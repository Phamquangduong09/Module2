package day27_4.demo;

public class demo {
    public static void main(String[] args) {
        String str1 = "  Pham Quang Duong  ";
        String str2 = "C0223i1";
        String str3 = str1.concat(str2);
        System.out.println("Chuỗi sau khi nối là :" + str3);
        String strLowerCase = str1.toLowerCase();
        System.out.println("Chuỗi trả về chữ thường :" + strLowerCase);
        String strToUpperCase = str1.toUpperCase();
        System.out.println("Chuỗi trả về chữ hoa là :" + strToUpperCase);
        System.out.println(str1.trim() + "CodeGym");

    }
}
