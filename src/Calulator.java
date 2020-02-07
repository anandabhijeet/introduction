import java.lang.*;
public class Calulator {
    double i;
    double x;
    void p(){
        x = Math.sqrt(i);
    }
}
class Demonstration_81{
    public static void main(String[] args){
        Calulator a = new Calulator();
        a.i = 20.0;
        a.p();
        System.out.println("Square root of"+a.i+" is "+a.x);

    }
}
