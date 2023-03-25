import java.util.*;

class Q1500 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();	// k <= s <= 100
		int k = sc.nextInt();	// k <= 20
		long ans = 1;				// 답은 9223372036854775807보다 작다. : 정확히 long범위 안에 들어온다.
	
		int count = s - (s/k) *k;	// 1이 큰 숫자의 개수
		for (int i=0;i<count ;i++ )
			ans *= (s/k + 1);
		for (int i=0;i<k-count ;i++ )
			ans *= s/k;

		System.out.println(ans);
	}
}
