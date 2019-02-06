package study2019_01_27;

import java.util.Scanner;

public class StringLength {
	// ���ڿ��� ���̱��ϴ� ����Լ�
	public static int length(String str) {
		if(str.equals("")) {
			return 0;
		} else {
			return 1 + length(str.substring(1));
		}
	}
	
	// ���ڿ��� ����Ʈ�ϴ� ����Լ�
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
	
	// 0��° �迭���� n��° �迭�� ��
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
	
	// ����Ž��
	// �˻��� ������ ����ġ�� ��������� ����
	// ������ġ�� 0���� �Ͻ�����ġ
	public int search1(int[] data, int n, int target) {
		for(int i=0; i<n; i++)
			if(data[i]==target)
				return i;
		return -1;
	}
	
	// �Ű������� ���ȭ: ���� �˻�
	// �˻��� ������ ���� ��ġ ����ġ ��������� ����
	// ����Լ��� �ۼ��Ҷ� ���� �⺻���� ��Ģ�� �ϳ�
	
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
	//�ִ밪 ã��
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
