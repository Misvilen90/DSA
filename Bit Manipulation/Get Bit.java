import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = s.nextInt();
        int bitmask = 1 << pos;
        if((bitmask & n) == 0){
            System.out.println("Bit is Zero");
        }else{
            System.out.println("Bit is one");
        }
        
    }
}
