package test;

import java.util.Scanner;

/*
 * 输入n个数组，将这个数组向后移动m位，后m个数放到前面
 */
public class TestShift {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("输入数字代表n个数");
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i] = in.nextInt();
		}
		System.out.println("请输入数字代表向后移动m位");
		int m = in.nextInt();
		int[] b = new int[m];
		int[] c = new int[n-m];
		for(int i=0; i<m; i++) {
			b[i] = a[i];
		}
		for(int i=m , j=0; i<n; i++,j++) {
			c[j] = a[i];
		}
		for(int i=0; i<n-m; i++) {
			a[i] = c[i];
		}
		for(int i=m-1,j=0; i<n;j++,i++) {
			a[i] = b[j];                       
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
