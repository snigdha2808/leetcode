import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int[] l= new int[n];
			l[0] = arr[0];
			for (int i = 1;i<l.length;i++) 
			{
				l[i] = Math.max(l[i-1],arr[i]);
			}
			int[] r=new int[n];
			r[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--) 
			{
				r[i]=Math.max(r[i+1],arr[i]);
			}
			int s=0;
			for (int i=0;i<r.length;i++) 
			{
				s=s+Math.min(l[i],r[i])-arr[i];
			}
			System.out.println(s);
		}
    }
}
