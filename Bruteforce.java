import java.util.*;
public class Main {
    public static ArrayList<ArrayList<Integer> > l = new ArrayList<ArrayList<Integer> >();
    public static  void bruteforce(int chosen[], int a[],int index, int r, int first, int last) {
        ArrayList <Integer> l1= new ArrayList<>();
        if (index == r) {
            for (int i = 0; i < r; i++) {
                l1.add(a[chosen[i]]);
            }
            l.add(l1);
            return;
        }
        for (int i = first; i <= last; i++) {
            chosen[index] = i;
            bruteforce(chosen, a, index + 1,r, i, last);
        }
        return;
    }

    static void repetition(int a[], int n, int r) {
        int chosen[] = new int[r + 1];
        bruteforce(chosen, a, 0, r, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int amount = sc.nextInt();
        ArrayList<ArrayList<Integer>>l2=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=amount;i++){
            repetition(a, n, i);
        }             
         for(int i=0;i<l.size();i++)
        {
            int total=0;
            for(int a1: l.get(i)) {
                 total += a1;
            }
            if(total==amount)
            {
                if(l2.isEmpty())
                  l2.add(l.get(i));
                else{
                    int x=l2.get(0).size();
                    int x1=l.get(i).size();
                    if(x>x1)
                    {
                        l2.remove(0);
                        l2.add(l.get(i));
                    }
                }  
                
            }
        }
          System.out.println("Minimum coins: "+l2.get(0).size()); 
        
    }
}