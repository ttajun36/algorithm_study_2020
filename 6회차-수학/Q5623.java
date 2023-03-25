import java.util.*;

class  Q5623
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] sum = new int[n][n];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<n ;j++ )
				sum[i][j] = sc.nextInt();

		int[] dp = new int[n];
		int sumAll=0;
		for (int i=0;i<n ;i++ )
			for (int j=0;j<n ;j++ ){
				dp[i] += sum[i][j];
				sumAll += sum[i][j];
			}
		
		sumAll /= 2*(n-1);
		for (int i=0;i<n ;i++ )
			System.out.print((dp[i]-sumAll)/(n-2) + " ");
	}
}
