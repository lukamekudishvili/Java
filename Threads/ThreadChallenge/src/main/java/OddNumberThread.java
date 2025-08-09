import java.util.concurrent.TimeUnit;

public class OddNumberThread extends Thread{
    public OddNumberThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=1, cnt=1;
        while(cnt<=5){
            try{
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " interrupted!");
                break;
            }
            System.out.println(i+" ");
            i+=2;
            cnt++;
        }
    }
}
