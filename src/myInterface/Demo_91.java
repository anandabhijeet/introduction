package myInterface;

public class Demo_91 implements anInterface {
    @Override
    public void display() {
        System.out.println("Fine!!");
    }
    public static void main(String args[]){
        Demo_91 d = new Demo_91();
        d.display();
        System.out.println("the final value a in my interface is : "+ a);
    }
}
