import java.util.*;

class Q1334 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String [] array_num = num.split("");
		int len = array_num.length-1;				//[0]�� �������

		if (len%2 != 0){
			if(array_num[(len+1)/2-1] < array_num[(len+1)/2+1])
				array_num[(len+1)/2]= int�� ��ȯ�ؼ� ++
				for (int i=1;i<(len+1)/2 ;i++ )
				{
					array_num[len+2-i]=array_num[i]
				}
		}
		else{
		}
		System.out.println(array_num.length);
		for (int i=0;i<array_num.length ;i++ )
		{
			System.out.println(array_num[0]);
		}
	}
}
