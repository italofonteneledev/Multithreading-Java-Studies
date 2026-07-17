package io.github.italofonteneledev;

public class Main {
    static void main() {
        Thread thread = new Thread(new BlockingTask());

        thread.start();

        thread.interrupt();
    }

    static class BlockingTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
