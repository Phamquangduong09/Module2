package btvn.Day12.Bai1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
   static Map<String,String> maps= new LinkedHashMap<>();
     static  Set<String> key = maps.keySet();
    public static void main(String[] args) {
        maps.put("Hello"," Xin chào a !!" );
        maps.put("Bye"," Tạm biệt !!" );
        maps.put("Love you"," hi " );
       do {
           System.out.println("---MENU---");
           System.out.println("1 . Add");
           System.out.println("2 . Search");
           System.out.println("3 . Update");
           Scanner sc =  new Scanner(System.in);
           int choice = Integer.parseInt(sc.nextLine());
           switch (choice){
               case 1 :
                   addDictionary();
                   break;
               case 2 :
                   searchDictionary();
                   break;
               case 3 :
                   updateDictionary();
                   break;
           }
       }while (true);
    }
    public static void addDictionary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Import");
        String str1 = scanner.nextLine();
        System.out.println("Enter Import");
        String str2 = scanner.nextLine();
        maps.put(str1,str2);
    }
    public static void searchDictionary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter key ");
        String keys = scanner.nextLine();
        if (keys != null) {
            for (String k : key) {
                if (keys.equalsIgnoreCase(k)) {
                    System.out.println(maps.get(k));
                }
            }
        }else {
            System.out.println("No result you need");
        }
    }
    public  static  void updateDictionary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter key ");
        String keys = scanner.nextLine();
        if(maps.containsKey(keys)){
            System.out.println( " Enter value ");
            String keys2 = scanner.nextLine();
            maps.put(keys,keys2);
        }else {
            System.out.println("No result you need");
        }
    }

}
