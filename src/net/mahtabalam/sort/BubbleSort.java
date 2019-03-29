package net.mahtabalam.sort;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 23, 54, 1, 7, 3, 2, 10 };

		for (int item : bubbleSort(array)) {
			System.out.print(item +" ");
		}

	}
}
