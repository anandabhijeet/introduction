import myPackage2.Balance;

public class Savings extends Balance {
    String branch;
    int customerID;
    Savings(String n, double bal, String br, int id){
        super(n, bal);
        branch = br;
        customerID = id;
    }
    public void show(){
        if (bal < 0){
            System.out.println("Sorry negative balance ");
        } else {
            System.out.println(name+" : $ "+bal+" "+branch+" "+customerID);
        }
    }
}

class Demo_812{
    public static void main(String args[]){
        Savings amnt[] = new Savings[3];
        amnt[0] = new Savings("ram", 34.67, "kolkata", 10);
        amnt[1] = new Savings("sam", 344.43, "delhi", 11);
        amnt[2] = new Savings("tom", 65.88, "Bihar", 12);

        for(int i=0; i < 3;  i++ ){
            amnt[i].show();
        }
    }
}