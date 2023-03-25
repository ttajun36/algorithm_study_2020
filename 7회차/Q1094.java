import java.util.*;

class Q1094 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n을 2진법으로 나타냈을 때 1의 개수를 출력하여라.
		int count=0;
		while (n>0){
			if (n%2==1)				//n을 2로 나눈 나머지가 1이면 count를 하나 늘리고, 
				count++;
			n/=2;							//n을 2로 나누자
		}

		System.out.println(count);
	}
}
