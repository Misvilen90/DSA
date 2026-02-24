import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l = 0;
        String[] str = new String[n];
        for (int i = 0 ;i < n ; i++){
            str[i]=s.next();
            l += str[i].length();
        }
        System.out.print(l);
    }
}
