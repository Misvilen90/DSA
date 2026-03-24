import java.util.*;
class Main {
    public static void fibonacci(int a ,int b , int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        fibonacci(b,a+b,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(0,1,n);
    }
}
