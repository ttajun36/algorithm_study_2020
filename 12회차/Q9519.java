import java.util.*;

class  Q9519
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String word = sc.next();
		String[] a_word = word.split("");				//�ѱ��ھ� �迭�� �޴´�.
		String[] answer = new String[a_word.length];
		//System.out.println(a_word.length);			//.length �ϸ� �ϳ��� ��� ����, [0]�� ��ĭ.
		
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
//abcfed		1. �ϴ� �� ��
//abcdef		2. �ڿ� ���� �ٽ� ����

//6�̸� 456 7
// length�� 7�̸� 123 456
// length�� 6�̸� 123 45
//5�� 45       6

//abcde
//aebdc

//abced
//abcde

