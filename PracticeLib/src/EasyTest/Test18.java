package EasyTest;

public class Test18 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();

    }
}

class Printer implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
