import java.util.*;
class Q2563 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] paper = new int [n][2];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<2 ;j++ )
				paper[i][j] = sc.nextInt();
		
		boolean indicator = false;
		int count = 0;
		for (int i=0;i<100 ;i++ ){
			for (int j=0;j<100 ;j++ ){
				for (int k=0;k<n ;k++ ){
					if ((2*i+1)>2*paper[k][0] && (2*i+1)<(2*paper[k][0]+20)	
									&& (2*j+1)>2*paper[k][1] && (2*j+1)<(2*paper[k][1]+20))
					{
						indicator = true;
						break;
						//ó�� ���� ���� ���̰� 100�� �����̸� 10000���� ���簢���� �����̶�� ����.
						//���簢���� ������ �ȿ� ����ִٰ� �Ǵ��ϸ� indicator�� true�� �ٲ۴�.
					}
				}

				if (indicator == false)
					count++;
				indicator = false;
			}
		}
		
		System.out.println(10000-count);
	}
}
