import myPackage2.*;
public class Demo_88 {
    public static void main(String args[]){
        Balance current[] = new Balance[3];
        current[0] = new Balance("Ram", 123.90);
        current[1] = new Balance("sam", 34.99);
        current[2] = new Balance("Tom", 67.98);
        for(int i = 0; i<3; i++) current[i].show();

    }
}
