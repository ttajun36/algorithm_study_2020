import java.util.*;

class Q1117 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();										// w, h�� 10^9 ������ ��
		int fold = sc.nextInt();
		int c = sc.nextInt();												// c+1�� H�� ����̴�. ���� �ʿ� x
		int x1 = sc.nextInt();	int y1 = sc.nextInt();
		int x2 = sc.nextInt();	int y2 = sc.nextInt();	//�̰͵� �˾Ƽ� ���� ���� ����.
	
		long area_total = width*height;						// ��ü
		long area_paint;													// ��ĥ�� ����
	
		//0���� f_new ������ 2��, f_new ���� w_new������ 1��
		int f_new = Math.min(fold, width-fold);
		int w_new = Math.max(fold, width-fold);
		
		if (x2 <= f_new)
			area_paint = 2*(x2-x1)*(y2-y1)*(c+1);
		else if (x1 >= f_new)
			area_paint = (x2-x1)*(y2-y1)*(c+1);
		else
			area_paint = (f_new-2*x1+x2)*(y2-y1)*(c+1);
			// (f_new - x1) (y2-y1)�� 2�� ����� �ϰ� 
			// (x2 - f_new) (y2-y1)�� 1�� ���ָ� ��.     �Ѵ� �������� c+1�� �ϴ� �Ŷ�

		System.out.println(area_total - area_paint);
	}
}