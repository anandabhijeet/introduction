package miniProject;

public class Building_A {
    int distance;
    long price;
    int area;
    int no_of_lift;

    Building_A(int d, long p, int a, int nol){
        distance = d;
        price = p;
        area = a;
        no_of_lift = nol;
    }

    void facility(){
        System.out.println("This building is available with 4 vacant and rentable flats");
        System.out.println("Distance of this building from ADYPU is : "+distance+"km");
        System.out.println("Payable per month amount is : "+price+" Rupees");
        System.out.println("Area of the this building is : "+area+ " acre");
        System.out.println("No. of lift in this building is : "+no_of_lift);
        System.out.println("There are two grocery store, a saloon and a super market are nearby this building.");
        System.out.println("Press 1 for more information ");
        System.out.println("Press 0 exit");

    }
}

