package io.github.italofonteneledev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        Thread thread = new Thread(() -> {

        });

        System.out.println("We are in thread: " + Thread.currentThread().getName() + "before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + "after starting a new thread");

        Thread.sleep(10000);
    }
}
