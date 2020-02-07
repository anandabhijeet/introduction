package aggregation;

public class Orders {
    int id;
    int orderid;
    String Product;
    User userId;

    public Orders(int id, int orderid, String product) {
    }


    public static void main(String[] args) {
        Orders od = new Orders(1, 121, "mobile" );
        System.out.println("id: "+ od.id  );

    }

}
