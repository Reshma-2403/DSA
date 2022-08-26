import java.util.*;
public class Main {
    public static int Topdown(int coins[], int amount) {
       int a[] = new int[amount+1];
        Arrays.fill(a,Integer.MAX_VALUE);
        a[0] = 0;
        for (int i = 1; i <= amount; i++) {
           for (int x: coins) {
              if (x <= i && a[i - x] != Integer.MAX_VALUE) {
                  a[i] = Math.min(a[i], 1 +  a[i - x]); 
              }
           } 
        } 
        return (a[amount] == Integer.MAX_VALUE) ? -1 : a[amount]; 
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        int total=sc.nextInt();
        System.out.println("Minimum coins: "+Topdown(a1,total));
    }
}