import java.util.*;
class Main {
    public static void iseven(int a){
        if(a%2 == 0){
                System.out.println(a+" is even");
            }else{
                System.out.println(a+" is odd");
            }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        iseven(num);
    }
}
