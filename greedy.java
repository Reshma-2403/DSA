import java.util.*;
public class Main
{
    public static void Greedy(int coin,int a[],int total){
        int count=0;
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=coin-1;i>=0;i--){
            while (total>=a[i]){
                total-=a[i];
                result.add(a[i]);
                count++;
            }
            if(total==0)
                 break;
        }
        System.out.println(result);
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int coin=sc.nextInt();
        int a[]=new int[coin];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int total=sc.nextInt();
        Greedy(coin,a,total);
    }
}