package javaTraining;

public class Constructordemo {
    Constructordemo(){
        System.out.println("default constructor is being called");
    }

    Constructordemo(int a){
        System.out.println("constructor is being used "+ a);
    }


    public static void main(String[] args) {
        Constructordemo cd = new Constructordemo();
        Constructordemo cd1 = new Constructordemo(5);
    }
}
