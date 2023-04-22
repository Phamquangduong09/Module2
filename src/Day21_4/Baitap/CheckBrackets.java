package Day21_4.Baitap;


public class CheckBrackets {
    public static void main(String[] args) {
        String arrBrackets1 = "()(()())()";
        String arrBrackets2 = "()()()(";
        System.out.println(checkBrackets(arrBrackets1));
    }

    public static boolean checkBrackets(String strings) {
        String[] strings1 = strings.split("");
        int count = 0;
        for (String s : strings1) {
            if (s.equals("(")) {
                count++;
            }
            if (s.equals(")")) {
                count--;
                if (count < 0 ){
                    return false;
                }
            }

        }
        if ( count > 0) {
            return false;
        } else {
            return true;
        }
    }

}
