import java.util.*;

class Q1254
{
	public static boolean isPalindrome(String s){
		char[] a = s.toCharArray();
		for (int i=0;i<s.length()/2 ;i++ )
			if (a[i]!=a[s.length()-1-i])
				return false;
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String newS;
		char[]a = s.toCharArray();
		
		for (int i=0;i<=s.length() ;i++ ){
			newS=s;
			for (int j=0;j<i ;j++ )
				newS+=a[i-1-j];
			if (isPalindrome(newS)){
				System.out.println(newS.length());
				return;
			}
		}
	}
}
