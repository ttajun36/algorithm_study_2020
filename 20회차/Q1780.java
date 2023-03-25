import java.util.*;
import java.io.*;
class Q1780
{
	public static int[] ans = new int [3];
	public static int[][] paper;

	public static boolean test(int x, int y, int n){
		for (int i=0;i<n ;i++ )
			for (int j=0;j<n ;j++ )
				if (paper[x+i][y+i]!=paper[x][y]){
					return false;
				}
		return true;
	}

	public static void function(int x, int y, int n){
		if (test(x,y,n))
			ans[paper[x][y]+1]++;
		else
			for (int i=0;i<3 ;i++ )
				for (int j=0;j<3 ;j++ ){
					int newN = n/3;
					function(x+newN*i, y+newN*j, newN);
				}
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];

		StringTokenizer st = null;
        for(int i=0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

		function(0, 0, n);
	
		for (int i=0;i<3 ;i++ )
			System.out.println(ans[i]);
	}
}
