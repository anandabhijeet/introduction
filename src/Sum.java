import java.util.*;
import java.lang.*;
import java.io.*;

class Sum {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int n = s.nextInt();



        if( m > n ){
            System.out.println("lesser");
        }else if( m < n ){
            System.out.println("greater");
        }else{
            System.out.println("equal");
        }
    }
}
