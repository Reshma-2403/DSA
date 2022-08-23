import java.util.*;
public class Main
{
    static int min(int a[], int coin, int sum)
    {
       if (sum == 0) 
            return 0;
       int result = Integer.MAX_VALUE;
       for (int i=0; i<coin; i++)
       {
         if (a[i] <= sum)
         {
             int sub_res = min(a, coin, sum-a[i]);
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < result)
                result = sub_res + 1;
         }
       }
       return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int coin=sc.nextInt();
        int a[]=new int[coin];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        System.out.println("Minimum coins required is "+ min(a,coin,sum) );
    }
}