import java.util.*;
class Main {
    public static void table(int a){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(a+" X "+ i + " = " + ( a*i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Which Table do you want?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        table(num);
    }
}
