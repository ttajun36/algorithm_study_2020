import java.util.*;

class  Q1309
{
	public static void main(String[] args) 
	{
		int max = 9901;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][] dp = new int[n+1][n+1][2];
		dp[0][0][0] = 1; dp[0][0][1] = 0;
		//2*0 배열에 0마리 -> 윗줄이 텅빈: 1, 윗줄 하나 있는: 0

		for (int i=1;i<=n ;i++ ){
			dp[i][0][0] = 1; dp[i][0][1]=0;
			for (int j=1;j<=i ;j++ ){
				dp[i][j][0] = (dp[i-1][j][0] + 2*dp[i-1][j][1])%max;
				dp[i][j][1] = (dp[i-1][j-1][0]+ dp[i-1][j-1][1])%max;
			}
		}

		int ans = 0;
		for (int i=0;i<=n ;i++ )
			ans += (dp[n][i][0] + 2*dp[n][i][1])%max;

		System.out.println(ans);
	}
}
