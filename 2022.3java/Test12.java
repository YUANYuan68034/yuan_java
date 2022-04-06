/**
	if分支语句
	1,。输入一个字符，判断是大写字母还是小写字母，输出提示信息
*/

import java.util.Scanner;
public class Test12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		
		
		//判断某一年是否为闰年(被4整除但不能被100整除，能被400整除)是闰年否则是平年

		
		System.out.println("请输入一个年份：");
		int year = input.nextInt();
		if ((year / 4==0&& year / 100!= 0) || year / 400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"是平年");
		}
	}
}