package net.mahtabalam.sort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int a1[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		printTestResult(a1, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		
		int a2[] = {98, 8, 56, 32, -1, 45, 55, 0};
		printTestResult(a2, new int[]{-1, 0, 8, 32, 45, 55, 56, 98});
		
		int a3[] = {-10, 1120, 572, 89, 123, 111, 432, 100, 987, 1321, 5642, 77, 10, 0};
		printTestResult(a3, new int[]{-10, 0, 10, 77, 89, 100, 111, 123, 432, 572, 987, 1120, 1321, 5642});
	}
	
	public static void printTestResult(int[] actual, int[] expected) {
		if(Arrays.equals(BubbleSortOptimized.bubbleSort(actual), expected)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}

}
