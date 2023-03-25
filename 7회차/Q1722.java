import java.util.*;

class Q1722
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		long a = 1;
		for (int i=0;i<n ;i++ )
		{
			a = a*(i+1);
		}
		System.out.println(a);
	}
}
