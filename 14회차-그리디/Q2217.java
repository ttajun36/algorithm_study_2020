import java.util.*;

class  Q2217
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rope = new int[n];
		for (int i=0;i<n ;i++ )
			rope[i] = sc.nextInt();

		Arrays.sort(rope);
		int[] weight = new int[n];
		for (int i=0;i<n ;i++ )
			weight[i] = rope[i]*(n-i);
		Arrays.sort(weight);
		System.out.println(weight[n-1]);
	}
}
