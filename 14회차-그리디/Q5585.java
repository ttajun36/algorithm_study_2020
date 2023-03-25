import java.io.*;

class  Q5585
{
	static void change_f(int[] change, int n){
		if (change[0]==0)
			return;
		
		while (change[0]>=n){
			change[0] -= n;
			change[1]++;
		}
	}

	public static void main(String[] args) 
	{
		int input=0;
		int[] change = new int [2];
		int[] change_case = {500, 100, 50, 10, 5, 1};

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = Integer.parseInt(br.readLine());
		}
		catch (IOException e)	{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		change[0] = 1000-input;
		for (int i=0;i<change_case.length ;i++ )
			change_f(change, change_case[i]);
		
		System.out.println(change[1]);
	}
}
