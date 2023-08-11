package task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Поток " + Thread.currentThread().getName() + " стартував " + time);
        MyThread firstThread = new MyThread();
        MyThread secondThread = new MyThread();
        firstThread.setName("first");
        secondThread.setName("second");
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Всі потоки завершили роботу ");
        System.out.println("Поток " + Thread.currentThread().getName() + " фінішував " + time);
    }
}
