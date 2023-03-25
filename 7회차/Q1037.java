import java.util.*;

class Q1037 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] factor = new int[n];
		for (int i=0;i<n ;i++ )
			factor[i] = sc.nextInt();

		int min=factor[0], max=factor[0];
		for (int i=1;i<n ;i++ ){
			if (min > factor[i])
				min = factor[i];
			if (max < factor[i])
				max = factor[i];
		}
		System.out.println(min*max);
	}
}
