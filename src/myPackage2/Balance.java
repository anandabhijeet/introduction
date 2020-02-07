package myPackage2;

public class Balance{
public String name;
public double bal;

public Balance(String n, double bl){
    name = n;
    bal = bl;

}
public void show(){
    if(bal < 0) {
        System.out.println("Sorry negative blance!!!");
    }
    System.out.println(name + ": $ "+ bal);
}
}