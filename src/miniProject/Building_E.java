package miniProject;

public class Building_E extends Building_A {
    Building_E(int d, long p, int a, int nol){
        super(d, p, a, nol);
    }
    void facility(){
        System.out.println("There is no any flat available in this Building E ");
        System.out.println("Distance of this building from ADYPU is : "+distance+"km");
        System.out.println("Payable per month amount is : "+price+" rupees");
        System.out.println("Area of the this building is : "+area+" acers");
        System.out.println("No. of lift in this building is : "+no_of_lift);
        System.out.println("There is one grocery store, a clothing shop, a gym and a Genral store are nearby this building.");

        System.out.println("Press 0 exit");

    }
}
