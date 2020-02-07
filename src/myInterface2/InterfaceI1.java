package myInterface2;

public interface InterfaceI1 {
    public static int i = 555;
    void printInterface();
}

interface InterfaceI2 extends InterfaceI1 {
    public static int j = 676;
    void display();
}
