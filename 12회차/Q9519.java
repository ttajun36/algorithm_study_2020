import java.util.*;

class  Q9519
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String word = sc.next();
		String[] a_word = word.split("");				//한글자씩 배열에 받는다.
		String[] answer = new String[a_word.length];
		//System.out.println(a_word.length);			//.length 하면 하나더 길게 세고, [0]은 빈칸.
		
		for (int j=0;j<x ;j++ )
		{
			for (int i=1;i<a_word.length ;i++ )
			{
				if (i%2==1) // 1, 3, 5
					answer[(i+1)/2]=a_word[i];
				else				//2,4,6
					answer[(a_word.length)/2 + i/2]=a_word[i];
			}
			for (int i=1; i<a_word.length; i++)
			{
				if (i<=a_word.length/2)
					a_word[i] = answer[i];
				else
					a_word[i] = answer[a_word.length-(i-a_word.length/2)];
			}
		}
		
		for (int i=1;i<a_word.length ;i++ ){
			System.out.print(a_word[i]);
		}
		System.out.println();
	}
}

//abcdef
//afbecd

//afbecd
//abcfed		1. 일단 반 반
//abcdef		2. 뒤에 반은 다시 정렬

//6이면 456 7
// length가 7이면 123 456
// length가 6이면 123 45
//5면 45       6

//abcde
//aebdc

//abced
//abcde

