import java.util.*;

class Q1477 
{
	public static boolean test(int mid, int[] restPlace, int m){
		int count=0;
		for (int i=1; i<restPlace.length ;i++ )
			count += (restPlace[i]-restPlace[i-1]-1)/mid;	//1�� �������. �ֳ��ϸ� �� �Ÿ��� �� ������ x����
		return count>m;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[] restPlace = new int [n+2];
		restPlace[0] = 0;	restPlace[1]=l;
		for (int i=2;i<n+2 ;i++ )
			restPlace[i] = sc.nextInt();
		Arrays.sort(restPlace);

		int left = 0;
		int right = l;
		int mid;
		//�̺�Ž�� left�� right�� ���� ��
		//return count>m�̹Ƿ� 
		while (left<=right)
		{
			mid = (left+right)/2;
			if(test(mid, restPlace, m))
				left = mid+1;
			else
				right = mid-1;
		}
		System.out.println(left);
	}
}
