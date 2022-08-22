import java.util.*;
public class Main
{
    public static int partition(int a[],int low,int high){
        int ri=(low)+(int)(Math.random() * (high-low+1));
        int temp=a[ri];
        a[ri]=a[high];
        a[high]=temp;
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int a1=a[i];
                a[i]=a[j];
                a[j]=a1;
            }
        }
        i++;
        int a1=a[i];
        a[i]=a[high];
        a[high]=a1;
        return i;
    }
    public static void qs(int a[],int low,int high){
        if(low<high){
            int p=partition(a,low,high);
            qs(a,low,p-1);
            qs(a,p+1,high);
        }
    }
	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter size of array");
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        System.out.println("Enter elements of array");
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        qs(a,0,n-1);
	        for(int i=0;i<n;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	}

}



