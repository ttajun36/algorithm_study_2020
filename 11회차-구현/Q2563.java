import java.util.*;
class Q2563 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] paper = new int [n][2];
		for (int i=0;i<n ;i++ )
			for (int j=0;j<2 ;j++ )
				paper[i][j] = sc.nextInt();
		
		boolean indicator = false;
		int count = 0;
		for (int i=0;i<100 ;i++ ){
			for (int j=0;j<100 ;j++ ){
				for (int k=0;k<n ;k++ ){
					if ((2*i+1)>2*paper[k][0] && (2*i+1)<(2*paper[k][0]+20)	
									&& (2*j+1)>2*paper[k][1] && (2*j+1)<(2*paper[k][1]+20))
					{
						indicator = true;
						break;
						//처음 가로 세로 길이가 100인 색종이를 10000개의 정사각형의 집합이라고 본다.
						//정사각형이 색종이 안에 들어있다고 판단하면 indicator를 true로 바꾼다.
					}
				}

				if (indicator == false)
					count++;
				indicator = false;
			}
		}
		
		System.out.println(10000-count);
	}
}
