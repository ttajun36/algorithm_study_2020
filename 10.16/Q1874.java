import java.util.*;

class  Q1874
{
	public static void func(int stack, int[] x, char[] y){
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stack = new int[n];
		for (int i=0;i<n ;i++ )
			stack[i] = sc.nextInt();
		
		int[] x = new int[n+1];
		for (int i=0;i<n ;i++ )
			x[i] = i+1;

		char[] y = new char[n*2 + 2];

		for (int i=0;i<n ;i++ )
			func(stack[i], x, y);

		if (y[n*2] == 'X')
			System.out.println("NO");
		else{
			for (int i=0;i<2*n ;i++ )
				System.out.println(y[i]);
		}
	}
}
