package day26_4.baitap1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
