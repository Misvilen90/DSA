import java.util.*;
class Main {
    public static void factorial(int a){
        int fact = 1;
        for(int i = 1 ; i <= a ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
    }
}
