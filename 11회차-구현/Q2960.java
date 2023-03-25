import java.util.*;

class  Q2960
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] number = new int[n+1];
		number[0]=1; number [1]=1;
		
		int count=0;
		int x;
		for (int i=2;i<n+1 ;i++ )
		{
			if (number[i] == 1)
				continue;
			else{
				number[i] = 1;
				count++;
				if (count == k){
					System.out.println(i);
					return;
				}
				
				x=i;
				while (x<=n){
					x += i;
					if (x <= n && number[x]==0){
						number[x] =1;
						count++;
						if (count == k){
							System.out.println(x);
							return;
						}
					}
				}
			}
		}
	}
}
