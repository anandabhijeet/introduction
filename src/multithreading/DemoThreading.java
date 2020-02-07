package multithreading;

class T extends Thread{
    public void run(){
        System.out.println("Start Thread A ....");
        for(int i = 1; i <= 5; i++){
            if(i == 1)yield();
            System.out.println("From Thread A: i = "+ i);
        }

        System.out.println("... Exit Thread A...");

    }
}

class B extends Thread{
    public void run(){
        System.out.println("Start of Thread B ...");
        for(int j = 1; j <= 5; j++){
            if (j == 2)stop();
            System.out.println("Yes Thread B is still running...");
        }
        System.out.println("... Exit Thread B.... ");
    }
}
class C extends Thread{
    public  void  run(){
        System.out.println("Start of Thread C ...");
        for( int k = 1; k <= 5; k++){
            if(k == 3)
                try {
                    sleep(1000);
                } catch (Exception e){}
        }

    }
}

public class DemoThreading {
    public static void main(String args[]){
        C c = new C();
        T t = new T();
        B b = new B();
        c.start(); b.start(); t.start();
        System.out.println("...End of execution...");
    }
}

