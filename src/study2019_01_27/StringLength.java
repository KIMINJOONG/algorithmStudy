package study2019_01_27;

public class StringLength {
	// 문자열의 길이구하는 재귀함수
	public static int length(String str) {
		if(str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}
	
	// 문자열을 프린트하는 재귀함수
	public static void printChars(String str) {
		if(str.length() == 0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	
	public static void printCharsReverse(String str) {
		if(str.length() == 0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	public static void printInBinary(int n) {
		if(n<2)
			System.out.print(n);
		else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
	public static int sum(int n, int[] data) {
		if(n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
	public static void main (String[] args) {
//		int result = length("abc");
//		System.out.println(result);
//		printChars("kiminjoong");
//		printCharsReverse("kiminjoong");
//		printInBinary(13);
		int a[] = {1,2,3,4};
		int result = sum(4, a);
		System.out.println(result);
	}
}
