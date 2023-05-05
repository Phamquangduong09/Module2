package day27_4.baitap.baitap1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIK]$");
        Matcher matcher = pattern.matcher(className);
        System.out.println(matcher.matches());
    }
}
