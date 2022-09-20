/**
 * @author Dm.Petrov
 * DATE: 20.09.2022
 */
public class Main {
    public static void main(String[] args) {
        Atc atc = new Atc();
        Thread atcThread = new Thread(atc);
        atcThread.start();

      Thread operator1 =  new Thread(()->{
            while (true) {
                try {
                    Integer j = atc.getCalls().take().getId();
                    System.out.println("Operator get call - "+j);
                    Thread.sleep(3000);
                    if(atc.getCalls().isEmpty()){
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       Thread operator2 =  new Thread(()->{
            while (true) {
                try {
                    Integer j = atc.getCalls().take().getId();
                    System.out.println("Operator get call - "+j);
                    Thread.sleep(3000);
                    if(atc.getCalls().isEmpty()){
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       operator1.start();
       operator2.start();
    }
    }
