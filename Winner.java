import java.util.*;
public class Main {
    public static void remove(LinkedList<Character> l1,int n){
        int count=1,i=0;
            while(l1.size()!=1){
                if(i==l1.size()){
                    i=0;
                }
                if(count%4==0 ||count%10==4){
                    l1.remove(i);
                    i=i-1;
                }
                count++;
                i+=1;
            }
        System.out.print(l1.get(0)); 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Character> l1  = new LinkedList<Character>(); 
        for(int i=0;i<n;i++){
            char s=sc.next().charAt(0);
            l1.add(s);
        }
        remove(l1,n);
    }
}