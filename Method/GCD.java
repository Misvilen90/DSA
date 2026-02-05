import java.util.*;
class Main {
    public static int gcd(int a , int b){
       if(b==0){
           return a;
       }
       else{
            return gcd(b,a%b);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
