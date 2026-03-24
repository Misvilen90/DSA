import java.util.*;
class Main {
    public static void fact(int n ,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
        fact(n-1,fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n,1);
    }
}
