public class CacheData {
    private volatile boolean flag=false;

    public void toggleFlag(){
        flag=!flag;
    }

    public boolean isReady(){
        return flag;
    }

    public static void main(String[] args) {
        CacheData example=new CacheData();

        Thread writerThread=new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            example.toggleFlag();
            System.out.println("A. Flag set to "+example.isReady());

        });

        Thread readerThread=new Thread(()->{
            while(!example.isReady()){

            }
            System.out.println("B. FLag is "+example.isReady());
        });

        writerThread.start();
        readerThread.start();

    }
}
