import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and colum");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enther the number");
        for (int i = 0 ; i < n ; i++){
            for(int j = 0;j < m ; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0 ; i < n ; i++){
            for(int j = 0;j < m ; j++ ){
                 System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        
    }
}
