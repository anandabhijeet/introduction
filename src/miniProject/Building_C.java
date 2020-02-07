package miniProject;

public class Building_C extends Building_A{
    Building_C(int d, long p, int a, int nol){
        super(d, p, a, nol);
    }
    void facility(){
        System.out.println("This building is available with 3 vacant and rentable flats");
        System.out.println("Distance of this building from ADYPU is : "+distance+"km");
        System.out.println("Payable per month amount is : "+price+" Rupees");
        System.out.println("Area of the this building is : "+area+ " acers");
        System.out.println("No. of lift in this building is : "+no_of_lift);
        System.out.println("There is park, a playground and two restaurants are nearby this building.");
        System.out.println("Press 1 for more information ");
        System.out.println("Press 0 exit");

    }
}

