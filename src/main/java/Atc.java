
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Atc implements Runnable {
    private ArrayBlockingQueue<MyCall> calls = new ArrayBlockingQueue<>(60);
    private static int timeToNextCall = 1000;

    public ArrayBlockingQueue<MyCall> getCalls() {
        return calls;
    }

    @Override
    public void run() {
        for (int i = 1; i <=60 ; i++) {
            try {
                calls.put(new MyCall());
                System.out.println("Got a call " + i);
                Thread.sleep(timeToNextCall);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
