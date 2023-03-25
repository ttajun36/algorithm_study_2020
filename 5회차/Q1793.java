import java.math.BigInteger;
import java.util.*;

class  Q1793
{
	public static void main(String[] args) 
	{
		BigInteger[] dp = new BigInteger[251];
		dp[0] = BigInteger.valueOf(1); 
		dp[1] = BigInteger.valueOf(1);
		for (int i=2;i<=250 ;i++ )
			dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));

		Scanner sc = new Scanner(System.in);
		int n;
		while (sc.hasNextInt()){
			n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}
}
