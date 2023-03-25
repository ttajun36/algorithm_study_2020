import java.io.*;

class Q2800 
//
{
	public static void print(char[] eqArr){
		String s = "";
		for (int i=0;i<eqArr.length ;i++ ){
			if (eqArr[i] != 'x')
				s += eqArr[i];
		}
		System.out.println(s);
	}

	public static void function(char[] eqArr, int[] count, int[] pr){
		if (count[0] == count[1]){
			if (count[2]!=0)
				print(eqArr);

			eqArr[pr[count[0]]]='x';
			int temp=0;
			for (int i=pr[count[0]];i<eqArr.length ;i++ )
				if (eqArr[i] == ')'){
					eqArr[i] = 'x';
					temp = i;
					break;
				}
			print(eqArr);
			eqArr[pr[count[0]]]='(';
			eqArr[temp] = ')';
		}
		else{
			count[0]++;
			function(eqArr, count, pr);
			
			count[0]--;
			int temp = 1;
			int temp2=0;
			eqArr[pr[count[0]]]='x';
			for (int i=pr[count[0]];i<eqArr.length ;i++ ){
				if (eqArr[i] == '(')
					temp++;
				else if(eqArr[i] == ')'){
					temp--;
					if (temp==0){
						eqArr[i] = 'x';
						temp2=i;
						break;
					}
				}
			}
			count[0]++;
			count[2]++;	//뭔가 변화가 있다면 ++
			function(eqArr, count, pr);
			count[0]--;
			eqArr[pr[count[0]]]='(';
			eqArr[temp2]=')';
		}
	}

	public static void main(String[] args) 
	{
		String eq="";

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			eq = br.readLine();
		}
		catch (IOException e)	{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		char[] eqArr = eq.toCharArray();
		int[] count = new int [3];
		for (int i=0;i<eqArr.length ;i++ )
			if (eqArr[i] == '(')
				count[1]++;									//괄호 개수
		count[1]--;											//편의상 -1
		
		int[] pr = new int [count[1]+1];
		int temp=0;
		for (int i=0;i<eqArr.length ;i++ )
			if (eqArr[i] == '('){
				pr[temp]=i;
				temp++;
			}
		
		function(eqArr, count, pr);
	}
}
/*
(0/(0))
(2+(2*2)+2)
(0/(3+(4+2))-2)
(0/(3+(4+2)+(5*3))-2)
*/
