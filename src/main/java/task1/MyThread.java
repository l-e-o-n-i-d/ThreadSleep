package task1;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{
    LocalDateTime time = LocalDateTime.now();

    @Override
    public void run(){
        System.out.println("Поток " + Thread.currentThread().getName() + " стартував " + time);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " фінішував " + time);
    }
}
