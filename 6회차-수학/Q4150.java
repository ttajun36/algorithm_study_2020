import java.util.*;
import java.math.BigInteger;

class  Q4150
{
	/*
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		BigInteger[] dp = new BigInteger[n];
		dp[0]=BigInteger.valueOf(1);
		dp[1]=BigInteger.valueOf(1);
		
		for (int i=2;i<n ;i++ )
			dp[i]=dp[i-1].add(dp[i-2]);

		System.out.println(dp[n-1]);
	}
	*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		BigInteger a=BigInteger.valueOf(1);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger c;
		
		switch (n)
		{
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(1);
				break;
			default:
				for (int i=0;i<n-2 ;i++ ){
					c=b;
					b=b.add(a);
					a=c;
				}
				System.out.println(b);
		}
	}
}
