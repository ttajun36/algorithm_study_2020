import java.util.*;

class Q2156 //2579 계단 오르기와 매우 비슷.
{
	public static int min(int a, int b, int c){
		int min = a;
		a = a>b ? b : a;
		a = a>c ? c : a;
		
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] wine = new int[10000];
		for (int i=0;i<n ;i++ )
			wine[i] = sc.nextInt();
		
		int[] dp = new int[10000];
		dp[0]=wine[0];
		dp[1]=wine[0]+wine[1];
		dp[2]=wine[0]+wine[1]+wine[2]-min(wine[0],wine[1],wine[2]);
		//초기값 설정. dp[2]는 0,1,2 중 2개 선택
		
		
		//무조건 oo로 끝나거나 xo 로 끝나거나 ox로 끝나게 된다.
		// ~oxoo / ~xo / ~ox 세개 중에 최대
		for (int i=3;i<n ;i++ ){
			if (dp[i-3] +wine[i-1]> dp[i-2])
				dp[i] = dp[i-3] +wine[i-1]+wine[i];
			else
				dp[i] = dp[i-2] + wine[i];
		
			dp[i] = dp[i]>dp[i-1] ? dp[i] : dp[i-1];
		}
		System.out.println(dp[n-1]);
	}
}
