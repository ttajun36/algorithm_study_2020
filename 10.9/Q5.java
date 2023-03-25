import java.util.*;

class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] a = new int[3];
		for (int i=0;i<3 ;i++ )
			a[i] = sc.nextInt();
		int[] b = new int[4];
		for (int i=0;i<3 ;i++ )
			b[i] = sc.nextInt();
		b[3] = b[0];

		int max=0;
		for (int i=0;i<3 ;i++ )
			max += (a[i]>b[i+1] ? b[i+1] : a[i]);

		int min=0;

		System.out.println(max);
	}
}
