import java.util.*;
class Main {
    public static void prim(int a){
        int count = 0 ;
        for(int i = 1 ; i <= a ; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count == 2){
                System.out.println(a+" is prime");
            }else{
                System.out.println(a+" is not prime");
            }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prim(num);
    }
}
