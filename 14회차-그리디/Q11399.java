import java.util.*;

class Q11399 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] time = new int[n];
		for (int i=0;i<n ;i++ )
			time[i] = sc.nextInt();

		Arrays.sort(time);
		int answer=0;
		for (int i=0;i<n ;i++ )
			answer += time[i] * (n-i);
		System.out.println(answer);
	}
}
