package abstraction;

public class Abstract extends Abstraction {


    @Override
    void showData() {
        System.out.println("abstract method is been implemented");
    }

    public static void main(String[] args) {
        Abstract ab = new Abstract();
        ab.showData();
        ab.getData();
    }
}
