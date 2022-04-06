/**
位运算符
*/
import java.util.Scanner;
public class Test10{
	public static void main(String[] args){
		System.out.println(~10);
		
		//通过个键盘输入，初始化两个数将这两个数据交换位置后，输出显示交换后的数据
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = input.nextInt();
		System.out.println("请输入第二个数：");
		int b = input.nextInt();
		//1、通过第三个变量来交换
		int c = a;
		a = b;
		b = c;
		//System.out.println("a="+a+"\n"+"b="+b);
		
		//2、不通过第三个变量进行交换
		a = a+b -(b=a);
		System.out.println("a="+a+"\n"+"b="+b);
	}
}