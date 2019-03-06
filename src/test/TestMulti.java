package test;

public class TestMulti {

	public static void main(String[] args) {

		/*
		 * for(int i=1; i<=9; i++) {
		 * 
		 * for(int j=1; j<=i; j++) {
		 * 
		 * System.out.print(j+"*"+i+"="+i*j+"\t"); } System.out.println(); }
		 * 
		 * int[] array = {33,44,55,66,77,88}; printArray(array);
		 * 
		 * int[] arra = {1,2,3,4,5,6,7,8}; receive(arra); for(int i=0; i<arra.length;
		 * i++) { System.out.print(arra[i]+" "); }
		 */

		/*int[] array = new int[500];
		for (int j = 0; j < 500; j++) {
			array[j] = (int) (Math.random() * 1000);
		}

		long startTime = System.currentTimeMillis();
		// selectSort(array);
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println(endTime - startTime + "s");*/
		
		int[] array = {1,2,3,4,5,6}; 
		int in = halfSearch(array,3);
		System.out.println(in);
	}

	// 按格式打印数组
	public static void printArray(int[] arr) {

		System.out.print("[");
		for (int k = 0; k < arr.length; k++) {
			if (k == arr.length - 1) {
				System.out.println(arr[k] + "]");
			} else {
				System.out.print(arr[k] + "，");
			}
		}
	}

	// 逆序
	public static void receive(int[] arr) {

		int temp;
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// 选择排序
	public static void selectSort(int[] arr) {

		int i;
		int j;
		int temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// 冒泡排序
	public static void bubbleSort(int[] arr) {

		int i;
		int j;
		int temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// 二分法查找
	public static int halfSearch(int[] arr, int num) {

		int mid = 0;
		int min = 0;
		int max = arr.length - 1;
		while (min<=max) {
			mid = (min + max) / 2;
			if (arr[mid] == num) {		
				return mid;
				
			} else if (arr[mid] > num) {
				max = mid-1;
			}
			else {
				min = mid+1;
			}
		}
		return -1;
	}
}
