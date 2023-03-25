import java.util.*;

class  Q1764
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n_notHeard = sc.nextInt();
		int n_notSeen = sc.nextInt();

		String[] notHeard = new String[n_notHeard];
		for (int i=0;i<n_notHeard ;i++ )
			notHeard[i] = sc.next();

		int n_answer=0;
		String[] answer = new String[n_notHeard];

		String notSeen;
		for (int i=0;i<n_notSeen ;i++ ){
			notSeen = sc.next();

			for (int j=0;j<n_notHeard ;j++ )
				if (notSeen.equals(notHeard[j])){
					answer[n_answer] = notSeen;
					n_answer++;
				}
		}

		Arrays.sort(answer);

		for (int i=0;i<n_answer ;i++ )
			System.out.println(answer[i]);
	}
}
/*
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton
*/

