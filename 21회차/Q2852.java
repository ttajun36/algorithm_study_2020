import java.util.*;

class  Q2852
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] score = new int [n+1][3];
		String s;
		for (int i=0;i<n ;i++ ){
			score[i][0] = sc.nextInt();
			s=sc.next();
			score[i][1] = Integer.parseInt(s.substring(0,2));		//분
			score[i][2] = Integer.parseInt(s.substring(3,5));		//초
		}
		score[n][1] = 48;	score[n][2] = 0;
		
		int[][] ansTeam = new int[2][3];	//team[0][0]은 1팀 분, [0][1]은 1팀 초, [0][2] 는 1팀 점수
		int winningTeam = -1;

		for (int i=0;i<n ;i++ ){
			ansTeam[score[i][0]-1][2]++;											//점수기록
			//이기고 있는 팀 판별
			if (ansTeam[0][2] > ansTeam[1][2])
				winningTeam = 0;
			else if (ansTeam[0][2] < ansTeam[1][2])
				winningTeam = 1;
			else
				winningTeam = -1;
			
			//비기고 있지 않다면, 이기는 쪽 분, 초를 더한다
			if (winningTeam != -1){
				ansTeam[winningTeam][0] += (score[i+1][1] - score[i][1]);
				ansTeam[winningTeam][1] += (score[i+1][2] - score[i][2]);
			}
		}

		//분, 초 계산
		for (int i=0;i<2 ;i++ ){
			//초가 음수일 때
			if (ansTeam[i][1]<0){
				ansTeam[i][0] -= (-ansTeam[i][1]/60 + 1);
				ansTeam[i][1] += ((-ansTeam[i][1]/60 + 1)*60);
			}
			//초가 60을 넘어갈 때
			if (ansTeam[i][1]>60){
				ansTeam[i][0] += ansTeam[i][1]/60;
				ansTeam[i][1] %= 60;
			}
		}
	
		// 답 형식: 한자리면 0 붙여주는그냥 간단한 연산
		String[] ans = new String[2];
		ans[0] = ""; ans[1]="";
		for (int i=0;i<2 ;i++ )
			for (int j=0;j<2 ;j++ ){
				if (ansTeam[i][j]/10 == 0)
					ans[i] += "0";
				ans[i] += ansTeam[i][j];

				if (j!=1)
					ans[i] +=":";
			}

		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}
}
