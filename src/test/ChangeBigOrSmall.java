package test;

import java.util.Scanner;

public class ChangeBigOrSmall {

	public static void main(String[] args) {

		int i;
		int temp1;
		int temp2;
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();//输入数组大小
		int[] array = new int[a];
		for(i=0; i<a; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			array[i] = in.nextInt();//输入数组内容
		}
//		for(i=0; i<a; i++) {
//			System.out.println(array[i]);
//		}
		int min=0;
		int max=0;
		for(i=1; i<a; i++) {
			if(array[i] > array[max]) {
				max = i;
			}
			if(array[i] < array[min]) {
				min = i;
			}
		}
		temp1 = array[0];
		temp2 = array[min];
		array[0] = array[max];
		array[max] = temp1;
		if(min != 0) {
			array[min] = array[a - 1];
			array[a - 1] = temp2;
		}else {
			array[max] = array[a - 1];
			array[a - 1] = temp1;
		}
		for(i=0; i<a; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

}
