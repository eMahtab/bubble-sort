package net.mahtabalam.sort;

public class BubbleSortOptimized {

	public static void main(String[] args) {
		int array[] = { 23, 54, 11, 7, 3, 2, 10 };
		for (int n : bubbleSort(array)) {
			System.out.print(n + " ");
		}
	}

	public static int[] bubbleSort(int[] array) {
		boolean swap;
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			swap = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
		return array;
	}
}
