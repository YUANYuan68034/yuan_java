/**
通过键盘输入声明初始化一个圆柱体的高和底面半径, pai值是3.14,求圆柱体的体积，并显示输出圆柱体的体积;∏(r 2)h。

*/
import java.util.Scanner;
public class Test6{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入圆的高：");
	int h = input.nextInt();
	System.out.println("请输入圆的底面半径：");
	int r = input.nextInt();
	
	double s = 3.14*r*r*h;
	System.out.println("圆柱的体积为："+s);
	}
}