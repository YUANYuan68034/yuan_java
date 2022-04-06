/**
do while循环:先执行,再判断,最少执行一次
2、Java阶乘求和1!＋2!＋...+10!
*/

public class Test21{
	public static void main(String[] args){
		int num = 0;//记录总和
		int i = 1;
		do{
			int j = 1;
			int jc = 1;
			while(j<=i){
				jc *= j;
				j++;
			}
			num += jc;
			i++;
		}while(i<=10);//循环条件
		System.out.println(num);
	}
}