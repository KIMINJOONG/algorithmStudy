package study2019_01_19;


/*
 * 정리: factorailFunc(int n)은 음이 아닌 정수 n에 대해서 n!을 올바로 계산한다.
 * 증명:
 * 1. n=0인 경우: n=0 인경우 1을 반환한다. 올바르다.
 * 2. 임의의 양의 정수 k에 대해서 n<k인 경우 n!을 올바르게 계산한다고 가정하자.
 * 3. n=k인 경우를 고려해보자. factorial은 먼저 factorialFunc(k-1) 호출하는데
 *    2번의 가정에 의해서 (k-1)!이 올바로 계산되어 반환된다.
 *     따라서 메서드 factorial은 k * (k-1)! = k!을 반환한다.
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
