package study2019_01_27;

import java.util.Scanner;

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
	
	// 0번째 배열에서 n번째 배열의 합
	public static int sum(int n, int[] data) {
		if(n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
	
	public static void readFrom(int n, int[] data, Scanner in) {
		if(n==0)
			return;
		else {
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
	
	// 순차탐색
	// 검색할 구간의 끝위치는 명시적으로 존재
	// 시작위치는 0으로 암시적위치
	public int search1(int[] data, int n, int target) {
		for(int i=0; i<n; i++)
			if(data[i]==target)
				return i;
		return -1;
	}
	
	// 매개변수의 명시화: 순차 검색
	// 검색할 구간의 시작 위치 끝위치 명시적으로 존재
	// 재귀함수를 작성할때 가장 기본적인 원칙중 하나
	
	public int search(int[] data, int begin, int end, int target) {
		if(begin > end)
			return -1;
		else if(target==data[begin])
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	
	public int search2(int [] data, int begin, int end, int target) {
		if(begin>end)
			return -1;
		else if(target==data[end])
			return end;
		else
			return search(data, begin, end-1, target);
	}
	
	public int search3(int[] data, int begin, int end, int target) {
		if(begin > end)
			return -1;
		else {
			int middle = (begin+end) /2;
			if(data[middle]==target)
				return middle;
			int index = search(data, begin, middle-1, target);
			if(index != -1)
				return index;
			else
				return search(data, middle+1, end, target);
		}
	}
	//최대값 찾기
	public int findMax(int [] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin+1, end));
	}
	
	public int findMax2(int[] data, int begin, int end) {
		if(begin == end)
			return data[begin];
		else {
			int middle = (begin + end) /2;
			int max1 = findMax2(data, begin, middle);
			int max2 = findMax2(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
	
	public static int binarySearch2(String[] items, String target, int begin, int end) {
		if(begin>end)
			return -1;
		else {
			int middle = (begin + end) /2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0)
				return middle;
			else if(compResult < 0)
				return binarySearch2(items, target, begin, middle-1);
			else
				return binarySearch2(items, target, middle+1, end);
		}
	}
	
	public static void main (String[] args) {
//		int result = length("abc");
//		System.out.println(result);
//		printChars("kiminjoong");
//		printCharsReverse("kiminjoong");
//		printInBinary(13);
//		int a[] = {1,2,3,4};
//		int result = sum(4, a);
//		System.out.println(result);
		
		
	}
}
