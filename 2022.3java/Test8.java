/**
根据天数（46）计算周数和剩余的天数，天数是通过键盘输入。

*/
import java.util.Scanner;
public class Test8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入天数：");
		int day = input.nextInt();
		int week = day/7;
		int days = day%7;
		System.out.println("周数是："+week+"\n"+"剩余天数："+days);
		
	}
}