import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        OddNumberThread oddNumberThread= new OddNumberThread("OddNumberThread");

        Thread evenNumberThread=new Thread(() -> {
            int i=0, cnt=1;
            while(cnt<=5){
                try{
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    System.out.println();
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                i+=2;
                System.out.println(i+" ");

                cnt++;
            }
        }, "EvenNumberThread");

        oddNumberThread.start();
        evenNumberThread.start();

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        oddNumberThread.interrupt();


    }
}
