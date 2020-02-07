import java.util.Scanner;

public class Array {

    void getData(){
        System.out.println("enter the value of a, b, c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] abc = {a, b, c};

      if(abc[0]>abc[1] && abc[0]>abc[2]){
              System.out.println(abc[0]+" is greater");

              if(abc[1]>abc[2]){
                  System.out.println(abc[2]+" is smallest");
              }else
                  System.out.println(abc[1]+" is smallest");

      }else if(abc[1]>abc[2] && abc[1]>abc[0]){

              System.out.println(abc[1]+" is greater");
              if(abc[2]>abc[0]){
                  System.out.println(abc[0]+" is smallest");
              }else{
                  System.out.println(abc[2]+" is smallest");
              }

      }else if(abc[2]>abc[0] && abc[2]>abc[1]){

               System.out.println(abc[2]+" is greater");
               if(abc[0]>abc[1]){
                   System.out.println(abc[1]+" is smallest");
               }else{
                   System.out.println(abc[0]+" is smallest");
               }

        }
    }

    public static void main(String[] args) {
        Array aa = new Array();
        aa.getData();
    }
}
