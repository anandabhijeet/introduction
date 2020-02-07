package myInterface1;

public class Demo_92 {
    public static void main(String args[]){
        //trying to create object of a interface as we know that interface is an abstract class so no abject can be created
        //C c = new C(); error : Object cannot be instantiated //create an object and instantiation by calling a construction

        C c2; // OK : Declaration of object is possible
        C c3[] = new C[3]; //OK : array of an object for an interface is permitted.


    }
}
