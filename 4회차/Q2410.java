import java.util.*;

class Q2410
{
	public static void main(String[] args) 
	{
		int MAX = 1000000000;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n==1){
			System.out.println(1);
			return;
		}

		int copyN = n;
		int k=0;
		while(2>1){
			if(copyN==1 || copyN==0)
				break;
			copyN /= 2;
			k++;
		}
		//N은 2의 k승 이상 2의 k+1승 미만						15의 k 3

		int [][] dp = new int [k][n/2+1];
		for (int i=0;i<n/2+1 ;i++ )
			dp[0][i]=1;														//15 - 2가0개 ~ 2가 7개: 인 경우 1개씩.
		copyN=n/2;														//copyN=7

		for (int i=1;i<k ;i++ )	{
			for (int j=0;j<copyN/2+1 ;j++) 					//4 -> 0~3개		8-> 0~1개
				for (int l=2*j;l<=copyN ;l++ )
					dp[i][j]= (dp[i][j]+dp[i-1][l])%MAX;
			copyN/=2;
		}

		System.out.println((dp[k-1][0]+dp[k-1][1])%MAX);
	}
}

/*
15
2 - 0개 1개 2개 3개 4개 5개 6개 7개
4 - 0개 1개 2개 3개
	4-0: 2-0 ~ 2-7
	4-1: 2-2 ~ 2-7
	4-2: 2-4 ~ 2-7
	4-3: 2-6 ~ 2-7
8 - 0개 1개
*/