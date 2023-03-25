import java.util.*;
 
class Q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tcase = sc.nextInt();
		int n=0, x=0;
 
		for(int i=0; i<tcase ; i++){
			n=sc.nextInt();	x=sc.nextInt();
 
			if(n==1 || n==2){
				System.out.println(1);
			}
			else {
				System.out.println((n-3)/x+2);
			}
		}
	}
}