/**
while循环
计算10的阶乘
*/
public class Test17{
	public static void main(String[] args){
		int i = 1;
		int num = 1; //计算总数
		while(i<=10){
			num *= i;
			i++;
		}
		System.out.println(num);
	}
}