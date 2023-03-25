import java.util.*;

class Q4 
{
	public static int func(int i, int n, int[] a){
		int sum = a[i];

		for (int j=i+1;j<n ;j++ ){
			sum+=a[j];
			if (sum==0)
				return j;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n ;i++ )
			a[i] = sc.nextInt();

		int count=0;

		boolean temp = true;
		for (int i=0;i<n ;i++ ){
			if (func(i,n,a)!=-1)
			{
				for (int j=i+1;j<func(i,n,a) ;j++ )
					if (func(j,n,a)!=-1)
						temp = false;
				if (temp == true)
					count++;
				temp=true;
			}
		}
		System.out.println(count);
	}
}


100
2 1 -2 -1 -2 -1 -2 1 2 1 -2 -1 -2 2 1 -2 -2 2 -2 2 -2 2 2
-1 -2 2 -1 -1 -2 -1 -2 2 -2 -2 -2 -1 1 -2 -1 2 -1 -2 1 -1
1 1 2 -2 1 -2 1 2 2 -2 1 -2 -1 -1 -2 -2 1 -1 -1 2 2 -1 2 1
-1 2 2 1 1 1 -1 -1 1 -2 -2 2 -1 2 -2 2 -2 -1 -2 -2 -1 -1 2
-2 -2 1 1 -2 -1 -2 -2 2
