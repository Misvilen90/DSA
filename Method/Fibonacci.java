import java.util.*;
class Main {
    public static void Fibonacci(int n){
        int a = 0 , b=1;
        for (int i = 0 ; i < n ; i++){
         System.out.print(a+" ");
         int c = a+b;
         a=b;
         b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Fibonacci(n);
    }
}
