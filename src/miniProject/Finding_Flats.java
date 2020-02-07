package miniProject;
import  java.util.Scanner;

public class Finding_Flats {
    public static void main(String args[]) {

        Building_A A = new Building_A(2, 13000, 4, 2);
        Building_B B = new Building_B(3, 12500, 5, 3);
        Building_C C = new Building_C(2, 14000, 4, 2);
        Building_D D = new Building_D(1, 20000, 2, 1);
        Building_E E = new Building_E(5, 10000, 4, 2);

        System.out.println("There are five buildings found around ADYPU in radius of 5 km");
        System.out.println("1. Building A");
        System.out.println("2. Building B");
        System.out.println("3. Building C");
        System.out.println("4. Building D");
        System.out.println("5. Building E");



        System.out.println("Only Building A, Building D and Building c have vacant flats");

        System.out.println("Press 1 validation ");

        for(int k = 0; k<=10; k++) {

            Scanner cs = new Scanner(System.in);
            int x = cs.nextInt();


            if (x == 1){



                System.out.println("Please Enter your Building number :");



                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();


                switch (i) {
                    case 1:
                        A.facility();
                        break;
                    case 2:
                        B.facility();
                        break;
                    case 3:
                        C.facility();
                        break;
                    case 4:
                        D.facility();
                        break;
                    case 5:
                        E.facility();
                        break;

                    default:
                        System.out.println("Invalid Input!!!! :-(");



                }
            }
            if(x == 0){
                break;
            }
        }
    }
}