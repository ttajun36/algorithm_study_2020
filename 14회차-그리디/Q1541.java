import java.util.*;

class Q1541 
{
	public static void main(String[] args) 
	{
		//		a1 + a2 - a3 + a4 + a5 - a6 +a7 - a8 - a9 
		//		a1 + a2 - (a3 + a4 + a5) - (a6 +a7) - a8 - a9 
		//		-와 - 사이만 괄호를 해주게 되면 결국 최솟값은
		//		(첫 - 가 등장할 때까지 숫자들의 합) - (첫 - 가 등장 한 후 숫자들의 합) 이다.

		//		결국 첫 - 가 등장하는 걸 찾아서 그 이전 숫자 합 - 그 이후 숫자 합을 해주면 끝
		
		Scanner sc = new Scanner(System.in);
		//exp에 식을 String을 담는다.
		String exp = sc.next();
		
		String[] str = exp.split("-");
		//str에 -기준으로 exp가 쪼개져서 배열에 담긴다.
		//str[0]은 첫 - 가 등장하기 전 모든것
		//str[1]은 첫 - 와 두번째 - 사이의 모든 것
		//... str[str.length-1]은 마지막 -와 마지막에서 2번째 - 사이의 모든 것
		
		int min = 0;
		//답을 담을 변수
		String[] tmp = str[0].split("\\+");
		//str[0] 을 + 기준으로 쪼개어 숫자들만 새롭게 배열에 넣어 int로 변환하자.
		for (int i=0;i<tmp.length ;i++ )
			min += Integer.parseInt(tmp[i]);		//첫 - 등장 전에는 min에 숫자들을 더해주고

		for (int i=1;i<str.length ;i++ ){
			tmp = str[i].split("\\+");
			for (int j=0;j<tmp.length ;j++ )
				min -= Integer.parseInt(tmp[j]);	// 그 이후는 빼주면 된다.
		}

		System.out.println(min);
	}
}
