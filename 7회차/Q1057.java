import java.util.*;

class  Q1057
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//n은 필요하지도 않고, -1이 나올 이유는 없다.
		int n = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		
		//가독 때문에 이렇게 한거지 사실 max min 없이 kim, lim만 바꿔주면 됨.
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
