import java.util.*;

class  Q12865
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int weight = sc.nextInt();
		int[][] object = new int [num+1][2];
		for (int i=1;i<=num ;i++ )
			for (int j=0;j<2 ;j++ )
				object[i][j] = sc.nextInt();

		int[][] dp = new int [num+1][weight+1];		//그냥 생각하기 편하려고
		for (int i=1;i<=num ;i++ )
			for (int j=1;j<=weight ;j++ ){
				dp[i][j] = dp[i-1][j];	//i번째 물건을 안담는 경우

				if (j>=object[i][0])	//i번째 물건을 담을 수 있을 때
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-object[i][0]]+object[i][1]);
					//i번째 물건을 담는게 이득일까 안담는게 이득일까
			}
		
		System.out.println(dp[num][weight]);
	}
}
