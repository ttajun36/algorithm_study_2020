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

		int[][] dp = new int [num+1][weight+1];		//�׳� �����ϱ� ���Ϸ���
		for (int i=1;i<=num ;i++ )
			for (int j=1;j<=weight ;j++ ){
				dp[i][j] = dp[i-1][j];	//i��° ������ �ȴ�� ���

				if (j>=object[i][0])	//i��° ������ ���� �� ���� ��
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-object[i][0]]+object[i][1]);
					//i��° ������ ��°� �̵��ϱ� �ȴ�°� �̵��ϱ�
			}
		
		System.out.println(dp[num][weight]);
	}
}
