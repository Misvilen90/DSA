import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String result = "";
        for(int i = 0 ; i < str.length();i++){
           if(str.charAt(i)=='e'){
              result +='i'; 
           }else{
               result+=str.charAt(i);
           }
       }
       System.out.println(result);
    }
}
