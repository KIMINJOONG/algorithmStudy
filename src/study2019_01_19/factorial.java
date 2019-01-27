package study2019_01_19;


/*
 * ����: factorailFunc(int n)�� ���� �ƴ� ���� n�� ���ؼ� n!�� �ùٷ� ����Ѵ�.
 * ����:
 * 1. n=0�� ���: n=0 �ΰ�� 1�� ��ȯ�Ѵ�. �ùٸ���.
 * 2. ������ ���� ���� k�� ���ؼ� n<k�� ��� n!�� �ùٸ��� ����Ѵٰ� ��������.
 * 3. n=k�� ��츦 ����غ���. factorial�� ���� factorialFunc(k-1) ȣ���ϴµ�
 *    2���� ������ ���ؼ� (k-1)!�� �ùٷ� ���Ǿ� ��ȯ�ȴ�.
 *     ���� �޼��� factorial�� k * (k-1)! = k!�� ��ȯ�Ѵ�.
 * */
public class factorial {
	public static void main(String[] args) {
		int result = factorialFunc(4);
		System.out.println(result);
	}
	
	public static int factorialFunc(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorialFunc(n-1);
		}
	}
}
