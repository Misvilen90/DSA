import java.util.*;
class Main {
    public static int secLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length;i++){
           if(arr[i]>first){
               sec=first;
               first = arr[i];
           }else if(arr[i]>sec && arr[i]!=first){
               sec=arr[i];
           }
        }
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
       for(int i = 0 ; i < n ; i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(secLargest(arr));
    }
}
