public class Scort {
    public void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }


    void print_sorted_list(int arr[]){
        int n = arr.length;
        for(int k = 0; k < n; ++k){
            System.out.print(arr[k] + " ");

        }

    }

    public static void main(String args[]){
        Scort ob1 = new Scort();
        int arr[] = {1, 2, 4, 5, 6, 65, 87};
        ob1.sort(arr);
        ob1.print_sorted_list(arr);
    }
}
