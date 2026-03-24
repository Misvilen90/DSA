import java.util.*;
class Main {
    public static void printpower(int a ,int b ,int a_){
        if(a==0){
            System.out.println(0);
            return;
        }
        if(b==0){
            System.out.println(a_);
            return;
        }
        a_*=a;
        printpower(a,b-1,a_);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        printpower(n,x,1);
    }
}
