import java.util.*;
 public class Main
{
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of queens: ");
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for(int j=0;j<N;j++){
            arr[i][j]=0;
        }
    }
   Queen q=new Queen(N);
   if(q.bt(arr,0)!=true){
       System.out.print("Doesn't exist");
   }
   else{
       q.print(arr);
   }
   sc.close();
    }
}
    class Queen{
        int m;
        Queen(int m){
            this.m=m;
        }
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        for (i = row, j = col; j >= 0 && i < m; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
     boolean bt(int board[][], int col)
    {
        if (col >= m)
            return true;
        for (int i = 0; i < m ;i++) {
            if (isSafe(board, i, col)){
                board[i][col] = 1;
                if (bt(board, col + 1) == true)
                    return true;
 
                board[i][col] = 0; 
            }
        }
 
        return false;
    }
    void print(int board[][]){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(" " + board[i][j]+ " ");
            }
                System.out.println();
        }
    }
    
}
