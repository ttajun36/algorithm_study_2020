import java.util.*;

class Q1500 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();	// k <= s <= 100
		int k = sc.nextInt();	// k <= 20
		long ans = 1;				// ���� 9223372036854775807���� �۴�. : ��Ȯ�� long���� �ȿ� ���´�.
	
		int count = s - (s/k) *k;	// 1�� ū ������ ����
		for (int i=0;i<count ;i++ )
			ans *= (s/k + 1);
		for (int i=0;i<k-count ;i++ )
			ans *= s/k;

		System.out.println(ans);
	}
}
