/**
从键盘输入一个成绩，判断该分数是否及格。
三目运算符与优先级
*/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个成绩：");
		int score = input.nextInt();
		//boolean bool = score >= 60? true:false;
		//System.out.println(bool);
		// String 表示一个字符串类型，不是基本数据类型
		String s = score>= 60?"及格":"不及格";
		System.out.println(s);
	}
}