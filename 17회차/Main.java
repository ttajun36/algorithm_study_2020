import java.util.*;

class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int len = 0;
		String[] voca = new String[n];
		for (int i=0;i<n ;i++ ){
			voca[i] = sc.next();
			len += voca[i].length();				// apple 의 length 는 5
		}
		
		int _num = (m-len) / (n-1);
		int _left = m - len - (_num * (n-1));

		String answer = voca[0];
		for (int i=0;i<n-1 ;i++ )
		{
			for (int j=0;j<_num ;j++ )
				answer += "_";
			
			if (_left >0)
				if (n-i-1 == _left || voca[i+1].charAt(0)>'_'){
					answer += "_";
					_left--;
				}

			answer += voca[i+1];
		}

		System.out.println(answer);
	}
}

/*
5 32
Alpha
Beta
Gamma
Delta
Epsilon
*/

// j=0 이면 1개 쓰고 n-1개 남음
// j=1 이면 2개 쓰고 n-2개 남음