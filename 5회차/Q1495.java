import java.util.*;

class Q1495
{
	/*
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int max = sc.nextInt();
		int[] gtar = new int[n];
		for (int i=0;i<n ;i++ )
			gtar[i] = sc.nextInt();
		
		int[] dp1 = new int[1]; dp1[0]=start;
		int[] dp2;
		int length=1, count;

		for (int i=0;i<n ;i++ ){
			count=0;
			for (int j=0;j<length ;j++ )
				if (dp1[j]!=-1)						
					count++;												//dp1에서 -1이 아닌 개수 -> count
			if (count==0){
				break;
			}
			
			dp2 = new int[2*count];								//dp2에 2*count 길이 만큼 배열 할당
			count=0;
			for (int j=0;j<length ;j++ )
				if (dp1[j]!=-1){
					if (dp1[j]+gtar[i]>max)
						dp2[count]=-1;
					else
						dp2[count]=dp1[j]+gtar[i];

					if(dp1[j]-gtar[i]<0)
						dp2[count+1]=-1;
					else
						dp2[count+1]=dp1[j]-gtar[i];

					count += 2;
				}
			dp1 = dp2;
			length = count;
		}

		int ans=dp1[0];
		for (int i=1;i<length ;i++ )
			if (ans<dp1[i])
				ans=dp1[i];

		System.out.println(ans);
	}
	*/

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int max = sc. nextInt();
		int[] gtar = new int[n];
		for (int i=0;i<n ;i++ )
			gtar[i] = sc.nextInt();
		
		int[][] dp = new int [n+1][max+1];
		dp[0][start] = 1;
		for (int i=1;i<=n ;i++ ){
			for (int j=0;j<=max-gtar[i-1] ;j++ )
				if (dp[i-1][j+gtar[i-1]]==1)
					dp[i][j] = 1;
			for (int j=max;j>=gtar[i-1] ;j-- )
				if (dp[i][j]==0 && dp[i-1][j-gtar[i-1]]==1)
					dp[i][j]=1;
		}
	
		int ans;
		for (int j=max;j>=0 ;j-- )
			if (dp[n][j]==1){
				System.out.println(j);
				return;
			}
		System.out.println(-1);

		//5가 딱 들어온다고하자. 0,1,2,3,4는 위로	 6 7 8 9 10은 아래로, 5는 둘다
		// 0~5 / 5~10
		//3이 들어오면                  0, 1, 2는 위로       8, 9, 10 은 아래로, 3, 4,5,6,7은 둘다
		// 0~7 / 3~10
		//7이 들어오면					0, 1, 2, 3은 위로	7, 8, 9, 10은 아래로 
		// 0~3 / 7~10

		// 0 0 0 0 0 1 0 0 0 0 0
		// 1 0 0 0 0 0 0 0 0 0 1
		// 0 0 0 1 0 0 0 1 0 0 0
		// 1 0 0 0 0 0 0 0 0 0 1
	}
}
