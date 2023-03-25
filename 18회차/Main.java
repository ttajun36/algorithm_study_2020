import java.util.*;

class AscendingInteger implements Comparator<Integer> { 
	@Override 
	public int compare(Integer a, Integer b){
		return b.compareTo(a); 
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[] restPlace = new int [n+2];
		restPlace[0] = 0;	restPlace[n+1] = l;
		for (int i=1;i<n+1 ;i++ )
			restPlace[i] = sc.nextInt();
		Arrays.sort(restPlace);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<n+1 ;i++ )
			list.add(restPlace[i+1] - restPlace[i]);
		
		Collections.sort(list, new AscendingInteger());			//내림차순 정렬

		int temp_1 = 0;
		int temp_2 = 0;
		for (int i=0;i<m ;i++ ){
			//전봇대는 끝에 세울 수 없다
			temp_1 = list.get(temp_2);
			while (temp_1==0 || temp_1==1 || temp_1/2==l || (temp_1+1)/2==l){
				temp_2++;
				temp_1 = list.get(temp_2);
			}

			// 거리의 max 값을 구해 max/2 와 (max+1)/2를 list에 넣어주면 된다.
			// 마지막에 (max+1)/2 추가, 0 index에 있는 값을 max/2로 변경
			//다시 정렬. -> m번 반복해주면 된다. 
			list.add((list.get(0)+1)/2);
			list.set(0, list.get(0)/2);
			Collections.sort(list, new AscendingInteger());			//내림차순 정렬

			temp_2=0;
		}
		System.out.println(list.get(0));
	}
}
/*

3 1 1000
200 701 800

/*

6 7 800
622 411 201 555 755 82

*/

