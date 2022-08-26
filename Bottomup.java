import java.util.*;
public class Main {
    public static int Bottomup(int coins[], int amount) {
        int result[] = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int minCoin = amount + 1;
            for (int x : coins) {
                int remains = i - x;
                if (remains < 0) {
                    continue;
                }
                minCoin = Math.min(minCoin, result[remains] + 1);
            }
            result[i] = minCoin;
        }
        return result[amount] == amount + 1 ? -1 : result[amount];
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int total=sc.nextInt();
        System.out.println("Minimum coins: "+Bottomup(a,total));
    }
}
