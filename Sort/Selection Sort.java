import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            int smallest = i;
            for(int j = i+1 ;j < n; j++){
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
