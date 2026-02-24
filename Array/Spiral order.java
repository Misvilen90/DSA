import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                arr[i][j]=s.nextInt();
            }
        }
        int rowsrt=0;
        int rowend = n-1;
        int colsrt=0;
        int colend = m-1;
        while(rowsrt<=rowend && colsrt<=colend){
        for (int i = colsrt ; i <= colend ; i++){
             System.out.print(arr[rowsrt][i]+" ");
        }
        rowsrt++;
        
        for(int i = rowsrt ; i <= rowend;i++){
             System.out.print(arr[i][colend]+" ");
        }
        colend--;
        
        for(int i = colend; i >= colsrt;i--){
            System.out.print(arr[rowend][i]+" ");
        }
        rowend--;
        
        for(int i = rowend ; i >= rowsrt;i--){
            System.out.print(arr[i][colsrt]+" ");
        }
        colsrt++;
        
        }
       
    }
}
