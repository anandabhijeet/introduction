package coding_questions;

public class Code1 {
    int multiplication(int arr[]){
        int n = arr.length;
        int max_product = 0; int max_product_new = 1;
        for(int i = 0; i<n; i++){
            max_product_new = max_product_new*arr[i];
            if (max_product < 0){
                max_product = 1;
            }

        }
        System.out.println(max_product_new);

        return max_product_new;
    }


    public static void main(String args[]){
        Code1 obj = new Code1();
        int arr[] = { 1, 2, 4, 5,6,7,78};

        obj.multiplication(arr);

    }
}
