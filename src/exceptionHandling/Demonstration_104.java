package exceptionHandling;

public class Demonstration_104 {
    public static void main(String[] args) {
        int[] abc = {1, 2, 3 , 4};
        try{
            System.out.println(abc[4]);
        }catch(Exception e){
            System.out.println("null pointer");
        };
    }
}
