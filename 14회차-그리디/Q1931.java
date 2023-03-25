class Q1931 
{
	public static void main(String[] args) 
	{
		char[] test = new char[5];
		test[0] = 'a';
		test[1] = 'b';
		test[2] = 'x';
		test[3] = 'd';
		test[4] = 'x';

		String s = "";
		for (int i=0;i<test.length ;i++ ){
			if (test[i] != 'x')
				s += test[i];
		}
		System.out.println(s);
	}
}
