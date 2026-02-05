import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enther the number");
        for (int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
    boolean isascent = false;
        for(int i =0 ; i < n-1 ;i++){
            if( arr[i]<arr[i+1]){
               isascent = true;
            }
        }
        if (isascent){
        System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
