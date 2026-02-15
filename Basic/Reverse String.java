import java.util.*;
class Main {
    public static String reverse(String s){
        String rev = "";
        for(int i = 0 ; i < s.length();i++){
            rev = s.charAt(i)+rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverse(s));
    }
}
