package myInterface4;

public class AandB extends A implements B {
    @Override
    public void display() {
        System.out.println("Value of y :"+y);
    }

    @Override
    void print() {
        super.print();
    }

    int sum(){
        return x+y;
    }
    void show(){
        System.out.println("Value of x plus y is : "+ sum());
    }
}
