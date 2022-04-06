import java.util.Scanner;   //接收键盘输入的工具类  除了lang文件夹的包使用时都需要引入
public class Test4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        a =10;
        b = 3;
        System.out.println(a/b);  //整除
        System.out.println(a%b);  //取模 输出余数

        a = b++; //先赋值后自增
        System.out.println("a="+a);
        System.out.println("b="+b);
		
		a = ++b; //前自增后赋值
		System.out.println("a="+a);
		
		int x = 1;
		int y = 2;
		y = x+y-(++y);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		//赋值运算符
		short s =10;
		//s = s+1;	//错误: 不兼容的类型: 从int转换到short可能会有损失  byte,short,int，它们三者在计算时会转换成int类型
		s += 1; //使用+=时  s不会变成int 
		System.out.println(s);
		
		//关系运算符
		System.out.println(x==y);
		
		//创建一个键盘输入的工具
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int x1 = input.nextInt(); //从键盘接收一个整数
		System.out.println("您刚刚输入的数字： "+x1);
		System.out.println("请输入一个字符串：");
		String x2 = input.next(); //从键盘接收一个字符串
		System.out.println("您刚刚输入的字符串： "+x2);
    }
}
