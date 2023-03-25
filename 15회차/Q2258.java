import java.util.*;

class Q2258 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] meat = new int [n][2];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<2 ;j++ )
				meat[i][j] = sc.nextInt();
	
		//meat 2차원 배열을 [0] 기준으로 정렬 (우선 가격으로 점점 비싸지게)
		//같은 값이면 높은 무게가 위에있게 정렬
		Arrays.sort(meat, new Comparator<int[]>(){
			@Override
			public int compare(int[] t1, int[]t2){
				if (t1[1] != t2[1])
					return t1[1] - t2[1];
				else
					return t2[0] - t1[0];
			}
		});

		/*/
		for (int i=0;i<n ;i++ ){
			for (int j=0;j<2 ;j++ )
				System.out.print(meat[i][j]);
			System.out.println();
		}
		//*/


		int weight = meat[0][0];
		int temp = 0;
		for (int i=1;i<n ;i++ ){
			if (weight > m){
				System.out.println(meat[i-1][1]);
				return;
			}

			if (meat[i-1][1] != meat[i][1]){
				weight += (temp + meat[i][0]);
				temp = 0;
			}
			else
				temp += meat[i][0];
		}
		
		if (weight > m)
			System.out.println(meat[n-1][1]);
		else
			System.out.println(-1);
	}
}

/*
5 9
4 8
1 2
5 6
3 6
2 4

1 2
2 4
5 6
3 6
4 8
*/