import java.util.*;

class Q1475 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[9];

		if (n==0){								//n==0 ����
			System.out.println(1);
			return;
		}

		while (n>0){
			if (n%10==9)
				dp[6]++;
			else
				dp[n%10]++;
			n/=10;
		}
		dp[6] = (dp[6]+1)/2;

		int max = dp[0];
		for (int i=1;i<9 ;i++ )
			if (max < dp[i])
				max = dp[i];
		System.out.println(max);
	}
}
