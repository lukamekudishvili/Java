import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Thread currentThread= Thread.currentThread();
        System.out.println(currentThread.getClass().getName());
        printThreadInfo(currentThread);

        currentThread.setName("MainGuy");
        printThreadInfo(currentThread);
        currentThread.setPriority(Thread.MAX_PRIORITY);

        CustomThread customThread= new CustomThread();

        customThread.start();

        for(int i=1; i<=3; i++){
            System.out.println("0");
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //2nd way

        Runnable runnable=() ->{
            for(int i=1; i<=8; i++){
                System.out.println("2");
//                try{
//                    TimeUnit.MILLISECONDS.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };

        Thread myThread= new Thread(runnable);
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();


    }

    public static void printThreadInfo(Thread thread){
        System.out.println("-".repeat(23));
        System.out.println("Thread ID: "+thread.getId());
        System.out.println("Thread threadId: "+thread.threadId());
        System.out.println("Thread name: "+thread.getName());
        System.out.println("Thread state: "+thread.getState());
        System.out.println("Thread group: "+thread.getThreadGroup());
        System.out.println("Thread priority: "+thread.getPriority());
        System.out.println("Threas Is Alive: "+thread.isAlive());
    }
}
