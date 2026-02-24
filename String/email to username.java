import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.next();
        String uname = "";
        for(int i = 0 ; i < email.length();i++){
           if(email.charAt(i)=='@'){
              break;
           }else{
               uname+=email.charAt(i);
           }
       }
       System.out.println(uname);
    }
}
