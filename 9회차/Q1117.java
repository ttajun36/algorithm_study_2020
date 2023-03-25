import java.util.*;

class Q1117 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();										// w, h는 10^9 이하의 수
		int fold = sc.nextInt();
		int c = sc.nextInt();												// c+1은 H의 약수이다. 검증 필요 x
		int x1 = sc.nextInt();	int y1 = sc.nextInt();
		int x2 = sc.nextInt();	int y2 = sc.nextInt();	//이것도 알아서 예외 없이 나옴.
	
		long area_total = width*height;						// 전체
		long area_paint;													// 색칠된 넓이
	
		//0부터 f_new 까지는 2번, f_new 부터 w_new까지는 1번
		int f_new = Math.min(fold, width-fold);
		int w_new = Math.max(fold, width-fold);
		
		if (x2 <= f_new)
			area_paint = 2*(x2-x1)*(y2-y1)*(c+1);
		else if (x1 >= f_new)
			area_paint = (x2-x1)*(y2-y1)*(c+1);
		else
			area_paint = (f_new-2*x1+x2)*(y2-y1)*(c+1);
			// (f_new - x1) (y2-y1)은 2번 세줘야 하고 
			// (x2 - f_new) (y2-y1)은 1번 세주면 됨.     둘다 공통으로 c+1배 하는 거랑

		System.out.println(area_total - area_paint);
	}
}