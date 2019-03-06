package test;

/*
 * 求1~100的奇数和
 * 分析：需要定义一个变量存放和值：sum，
 * 通过判断是否为奇数，是则累加，输出。
 */
public class OddCounter {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		for(i=1; i<=100; i++ ) {
			
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	
		char da = 'A';
		char xiao = 'a';
		
		for(int j=0; j<26; j++) {
			
			System.out.println("大写字母： "+da+"······小写字母： "+xiao);
			da++;
			xiao++;
			
		}	
		
	}

}
