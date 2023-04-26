package day26_4.baitap2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new EvenThread());
        Thread thread2 = new Thread(new OddThread());
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
