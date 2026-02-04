import java.util.*;
class Main {
    public static void powerof(int a , int b){
       int num = 1;
       for(int i = 0 ; i < b;i++){
           num=num * a;
       }
       System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the number");
        int a = sc.nextInt();
        System.out.println("Enter the power of the number");
        int b = sc.nextInt();
        powerof(a,b);
    }
}
