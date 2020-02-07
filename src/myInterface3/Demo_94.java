package myInterface3;

public class Demo_94 implements I1,I3 {
    @Override
    public void display() {
        System.out.println("From i1 x is : "+x);
    }

    @Override
    public void show() {
        System.out.println("From I3 y is : "+y);
    }
    int sum(){
        return x+y;
    }

    void print(){
        System.out.println("Sum of x and y is : "+ sum());
    }
}

 class DemoMain_94{
    public static void main(String args[]){
        Demo_94 d94 = new Demo_94();
        d94.display();
        d94.show();
        d94.print();
    }
}
