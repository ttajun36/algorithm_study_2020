import java.util.*;

class Q3020 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();

		// 1 ~ h
		int[] barrier = new int [h+1];
		int temp;
		for (int i=0;i<n ;i++ ){
			temp = sc.nextInt();
			if (i%2 == 0)
				for (int j=1;j<=temp ;j++ )
					barrier[j]++;
			else
				for (int j=h;j>=temp ;j-- )
					barrier[j]++;
		}
		
		Arrays.sort(barrier);
		System.out.println(barrier[1]);
		
		int count=0;
		for (int i=1;i<h+1 ;i++ )
			if (barrier[i] == barrier[1])
				count++;
		System.out.println(count);
	}
}
