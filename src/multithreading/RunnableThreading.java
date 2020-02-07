package multithreading;


class ThreadX implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("ThreadX starts with i = "+ -1*i);
        }
        System.out.println("Exiting of thread x... ");
    }
}

class ThreadY implements  Runnable{
    public void run(){
        for(int j = 1; j<=5; j++){
            System.out.println("thread Y starts with j = "+2*j);
        }
        System.out.println("exiting of thread y....");
    }
}

class ThreadZ implements Runnable{
    public void run(){
        for(int k = 1; k <= 5; k++ ){
            System.out.println("Thread Z starts with k = "+2*(k-1));
        }
        System.out.println("Exiting of Thread Z....");
    }
}

public class RunnableThreading {
    public static void main(String args[]){
        //ThreadX x = new ThreadX();
        Thread t1 = new Thread(new ThreadX());
        //ThreadY y = new ThreadY();
        Thread t2 = new Thread(new ThreadY());
        //ThreadZ z = new ThreadZ();
        Thread t3 = new Thread(new ThreadZ());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Multithreading is exiting...");
    }
}
