import java.util.*;

class Q1789 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();

		int count=1;
		long n=1;
		while(n<s){
			n=n+count+1;
			count++;
		}
		if (n>s)
			count--;
		System.out.println(count);
	}
}
