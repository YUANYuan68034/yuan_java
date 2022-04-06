/**
switch 分支语句
*/

import java.util.Scanner;
public class Test14{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入1~7的数字");
		int num = input.nextInt();
		//switch括号内的表达式的返回值必须是int/char/short/byte,1.7后支持string
		switch(num){
			case 1:
				System.out.println("星期一");					
				break;
			case 2:
				System.out.println("星期二");					
				break;
			case 3:
				System.out.println("星期三");					
				break;
			case 4:
				System.out.println("星期四");					
				break;
			case 5:
				System.out.println("星期五");					
				break;
			case 6:
				System.out.println("星期六");					
				break;
			case 7:
				System.out.println("星期日");					
				break;
		}
	}
}
