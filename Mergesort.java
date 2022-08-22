import java.util.*;
public class Main
{
	public static void conquer(int a[],int first,int mid,int last){
	    int merge[]=new int[last-first+1];
	    int i1=first;
	    int i2=mid+1;
	    int k=0;
	    while(i1<=mid && i2<=last){
	        if(a[i1]<=a[i2]){
	            merge[k]=a[i1];
	            k++;
	            i1++;
	        }
	        else{
	            merge[k]=a[i2];
	            k++;
	            i2++;
	        }
	    }
	    while(i1<=mid){
	        merge[k]=a[i1];
	        k++;
	        i1++;
	    }
	    while(i2<=last){
	        merge[k]=a[i2];
	        k++;
	        i2++;
	    }
	    int i,j;
	    for(i=0,j=first;i<merge.length;i++,j++){
	        a[j]=merge[i];
	    }
	}
	public static void divide(int a[],int first,int last){
	    if(first>=last){
	        return;
	    }
	    int mid=(first+last)/2;
	    divide(a,first,mid);
	    divide(a,mid+1,last);
	    conquer(a,first,mid,last);
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
	        divide(a,0,n-1);
	        for(int i=0;i<n;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	}
}

