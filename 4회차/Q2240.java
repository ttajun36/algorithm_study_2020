import java.util.*;

class Q2240
{
	public static long max(long a, long b, long c){
		a=a>b ? a : b;
		a=a>c ? a : c;
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] dp= new long[100];
		for (int i=0;i<6 ;i++ )
			dp[i] = i+1;
		for (int i=6;i<100 ;i++ )
			dp[i] = max(dp[i-3]*2, dp[i-4]*3, dp[i-5]*4);
		System.out.println(dp[n-1]);
	}
}
