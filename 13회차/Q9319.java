import java.util.*;
import java.io.*;

class  Q9319
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int caseNum = Integer.parseInt(br.readLine());
			String[] s;

			int deviceNum;
			int noise_lev;
			int[] listen = new int[2];
			double[][] device = new double [100000][4];	//[0]이 x좌표, [1]이 y좌표, [2]가 신호 세기, [3]이 r_i 저장한것
			double device_r_sum;
			
			for(int x=0; x<caseNum; x++){
				deviceNum = Integer.parseInt(br.readLine());
				noise_lev = Integer.parseInt(br.readLine());
				
				s=br.readLine().split(" ");
				for (int i=0;i<2 ;i++ )
					listen[i] = Integer.parseInt(s[i]);
				for (int i=0;i<deviceNum ;i++ ){
					s=br.readLine().split(" ");
					for (int j=0;j<3 ;j++ )
						device[i][j] = Integer.parseInt(s[j]);
				}

				device_r_sum=0;
				for (int i=0;i<deviceNum ;i++ ){
					device[i][3] = (device[i][2] / (Math.pow(listen[0]-device[i][0], 2) + Math.pow(listen[1]-device[i][1], 2)));
					device_r_sum += device[i][3];
				}
				device_r_sum = 6*noise_lev + 6*device_r_sum;

				boolean count=false;
				for (int i=0;i<deviceNum ;i++ )
					if (device[i][3] > (device_r_sum - 6*device[i][3])){
						count=true;
						System.out.println(i+1);
					}
				if (count==false)
					System.out.println("NOISE");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
/*
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		for(int x=0; x<caseNum; x++){
			int deviceNum = sc.nextInt();
			int noise_lev = sc.nextInt();

			int[] listen = new int[2];
			int[][] device = new int[deviceNum][3];	//[0]이 x좌표, [1]이 y좌표, [2]가 신호 세기
			for (int i=0;i<2 ;i++ )
				listen[i] = sc.nextInt();
			for (int i=0;i<deviceNum ;i++ )
				for (int j=0;j<3 ;j++ )
					device[i][j] = sc.nextInt();

			//float로 가야 하는건가? double로 가야 하는건가? 설마 int?
			double[] device_r = new double[deviceNum];
			double device_r_sum=0;
			for (int i=0;i<deviceNum ;i++ ){
				device_r[i] = ((double) device[i][2]) / (Math.pow(listen[0]-device[i][0], 2) + Math.pow(listen[1]-device[i][1], 2));
				device_r_sum += device_r[i];
			}
			device_r_sum = 6*noise_lev + 6*device_r_sum;

			int count=0;
			for (int i=0;i<deviceNum ;i++ )
				if (device_r[i] > (device_r_sum - 6*device_r[i])){
					count++;
					System.out.print(i+1+" ");
				}
			if (count==0)
				System.out.print("NOISE");
			System.out.println();
		}
	}
*/
/*
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();

		int deviceNum;
		int noise_lev;
		int[] listen = new int[2];
		int[][] device = new int [100000][4];	//[0]이 x좌표, [1]이 y좌표, [2]가 신호 세기, [3]이 r_i 저장한것
		int device_r_sum;
		
		for(int x=0; x<caseNum; x++){
			deviceNum = sc.nextInt();
			noise_lev = sc.nextInt();

			for (int i=0;i<2 ;i++ )
				listen[i] = sc.nextInt();
			for (int i=0;i<deviceNum ;i++ )
				for (int j=0;j<3 ;j++ )
					device[i][j] = sc.nextInt();

			device_r_sum=0;
			for (int i=0;i<deviceNum ;i++ ){
				device[i][3] = (int) (device[i][2] / (Math.pow(listen[0]-device[i][0], 2) + Math.pow(listen[1]-device[i][1], 2)));
				device_r_sum += device[i][3];
			}
			device_r_sum = 6*noise_lev + 6*device_r_sum;

			boolean count=false;
			for (int i=0;i<deviceNum ;i++ )
				if (device[i][3] > (device_r_sum - 6*device[i][3])){
					count=true;
					System.out.println(i+1);
				}
			if (count==false)
				System.out.println("NOISE");
		}
	}
*/