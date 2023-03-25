import java.util.*;

class Q4883
{
	public static int min(int a, int b){
		a = a<b ? a: b;
		return a;
	}

	public static int min(int a, int b, int c){
		a = a<b ? a: b;
		a = a<c ? a: c;
		return a;
	}

	public static int min(int a, int b, int c, int d){
		a = a<b ? a: b;
		a = a<c ? a: c;
		a = a<d ? a: d;
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] tri = new int[n][3];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<3 ;j++ )
				tri[i][j] = sc.nextInt();
		
		int[][] dp = new int[n-1][3];
		int[][]ndp = new int [n-1][3];
		for (int i=0;i<3 ;i++ ){
			dp[0][i] = tri[0][1] + tri[1][i];
			ndp[0][i] = 1;
		}
		
		for (int i=1;i<n-1 ;i++ ){
			dp[i][0] = min(dp[i-1][0], dp[i-1][1]) + tri[i][0];
			if (dp[i][0]-tri[i][0]==dp[i-1][0])
				ndp[i][0] += ndp[i-1][0];
			if (dp[i][0]-tri[i][0]==dp[i-1][1])
				ndp[i][0] += ndp[i-1][1];

			dp[i][1] = min(dp[i-1][0], dp[i-1][1], dp[i-1][2], dp[i][0]) + tri[i][1];
			if(dp[i][1]-tri[i][1]==dp[i-1][0])
				ndp[i][1] += ndp[i-1][0];
			if(dp[i][1]-tri[i][1]==dp[i-1][1])
				ndp[i][1] += ndp[i-1][1];
			if(dp[i][1]-tri[i][1]==dp[i-1][2])
				ndp[i][1] += ndp[i-1][2];
			if(dp[i][1]-tri[i][1]==dp[i][0])
				ndp[i][1] += ndp[i][0];

			dp[i][2] = min(dp[i-1][1], dp[i-1][2], dp[i][1]) + tri[i][2];
			if (dp[i][2] - tri[i][2]==dp[i-1][1])
				ndp[i][2] += ndp[i-1][1];
			if (dp[i][2] - tri[i][2]==dp[i-1][2])
				ndp[i][2] += ndp[i-1][2];
			if (dp[i][2] - tri[i][2]==dp[i][1])
				ndp[i][2] += ndp[i][1];
		}

		System.out.printf("%d. %d\n",ndp[n-2][1], dp[n-2][1]);
	}
}
