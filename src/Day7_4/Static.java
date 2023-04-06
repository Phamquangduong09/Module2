package Day7_4;

public class Static {
    public static void main(String[] args) {
        change();
        System.out.println(name);
        MyClass j = new MyClass();
        System.out.println(j.number);
    }

    static String name = "Codegym";  // khai báo  biến static

    static {                         // khối static
        name = " c0223i1";
    }

    static void change() {
        name = "C0223i1 codegym";    //phương thức static có thể thay đổi và truy cập biến
    }

    static class MyClass {            //lớp static
        public int number = 4;
    }
}

