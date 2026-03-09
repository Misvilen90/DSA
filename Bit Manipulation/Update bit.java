import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int op = s.nextInt();
        if(op == 0){
            int bitmask = ~(1 << pos) ;
            System.out.println(bitmask&n);
        }else{
            int bitmask = 1<< pos;
            System.out.println(bitmask|n);
        }
    }
}
