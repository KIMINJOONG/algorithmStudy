package study2019_01_19;
// recurision(����Լ�)�� ������ ���ѷ����� �������ʴ´�!

/*���� : func(int n)�� ���� �ƴ� ���� n�� ���ؼ� 0���� n������ ���� �ùٷ� ����Ѵ�.
 * 
 * ���� : 
 * 1. n = 0 �� ��� : n=0�� ��� 0�� ��ȯ�Ѵ�. �ùٸ���.
 * 2. ������ ���� ���� k�� ���ؼ� n < k �ΰ�� 0���� n������ ���� �ùٸ��� ����Ͽ� ��ȯ�Ѵٰ� ��������.
 * 3. n=k�� ��츦 ����غ���. func�� ���� func(k-1) ȣ���ϴµ� 2���� ������ ���ؼ� 0�ּ�
 * 	  k-1������ ���� �ùٷ� ���Ǿ� ��ȯ�ȴ�. �޼��� func�� �� ���� n �����ؼ� ��ȯ�Ѥ�. ���� func�� 0���� k������ ���� �ùٷ� ����Ͽ� ��ȯ�Ѵ�.
 * 
 * */
public class code02 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	public static int func(int n) {
		if(n <= 0) {
			return 0;
		} else {
			return n + func(n-1);
		}
	}
}
