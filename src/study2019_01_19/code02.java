package study2019_01_19;
// recurision(재귀함수)는 무조건 무한루프에 빠지지않는다!

/*정리 : func(int n)은 음이 아닌 정수 n에 대해서 0에서 n까지의 합을 올바로 계산한다.
 * 
 * 증명 : 
 * 1. n = 0 인 경우 : n=0인 경우 0을 반환한다. 올바르다.
 * 2. 임의의 양의 정수 k에 대해서 n < k 인경우 0에서 n까지의 합을 올바르게 계산하여 반환한다고 가정하자.
 * 3. n=k인 경우를 고려해보자. func은 먼저 func(k-1) 호출하는데 2번의 가정에 의해서 0애서
 * 	  k-1까지의 합이 올바로 계산되어 반환된다. 메서드 func은 그 값에 n 을더해서 반환한ㄷ. 따라서 func은 0에서 k까지의 합을 올바로 계산하여 반환한다.
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
