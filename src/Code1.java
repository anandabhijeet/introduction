import java.util.*;
import java.lang.*;

import static myInterface.anInterface.a;

public class Code1 {



    void showData(int a, int b, int c){

        if(a>b && a>c){
            System.out.println(" a is greater than b and c");
        }else if(b>a && b>c){
            System.out.println("b is grreater");
        }else if (c>a && c>b){
            System.out.println("c is greater");
        }
    }

    void show(int a, int b, int c){
        if(a<b && a<c){
            System.out.println("a is smaller");
        }else if(b<c && b<a){
            System.out.println("b is smaller");
        }else{
            System.out.println("c is smaller");
        }
    }

    public static void main(String[] args) {
        Code1 c1 = new Code1();
        System.out.println("enter the value of a, b, c");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            c1.showData(a,b,c);
            c1.show(a,b,c);


    }
}
