package miniProject;

public class Building_B extends Building_A{
    Building_B(int d, long p, int a, int nol){
        super(d, p, a, nol);
    }
    void facility(){
        System.out.println("There is no any flat available in this Building B ");
        System.out.println("Distance of this building from ADYPU is : "+distance+"km");
        System.out.println("Payable per month amount is : "+price+ " Rupees");
        System.out.println("Area of the this building is : "+area+ " acre");
        System.out.println("No. of lift in this building is : "+no_of_lift);
        System.out.println("There is one grocery store, a clothing shop and a gym are nearby this building.");
        System.out.println("Press 1 for more information ");
        System.out.println("Press 0 exit");

    }
}
