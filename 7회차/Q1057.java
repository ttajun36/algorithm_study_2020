import java.util.*;

class  Q1057
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//n�� �ʿ������� �ʰ�, -1�� ���� ������ ����.
		int n = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		
		//���� ������ �̷��� �Ѱ��� ��� max min ���� kim, lim�� �ٲ��ָ� ��.
		int max, min;
		if (kim>lim)	
			{max=kim; min=lim;}
		else					
			{max=lim; min=kim;}

		int count=1;
		while(true){
			if (max%2==0 && max==min+1){
				System.out.println(count);
				break;
			}
			max=(max+1)/2;
			min=(min+1)/2;
			count++;
		}
	}
}
