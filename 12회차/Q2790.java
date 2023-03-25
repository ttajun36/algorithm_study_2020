import java.util.*;

class Q2790 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] driver = new int[n];
		int[] need = new int [n];
		for (int i=0;i<n ;i++ )
			driver[i] = sc.nextInt();
		Arrays.sort(driver);

		for (int i=0;i<n ;i++ ){
			need[i]=driver[i] + n-i;
		}
		Arrays.sort(need);
	
		int count=0;
		for (int i=0;i<n ;i++ )
		{
			if (driver[i]+n>=need[n-1])
				count++;
		}
		System.out.println(count);
	}
}
