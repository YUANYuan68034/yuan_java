/**
do while 循环  先执行再判断
逆序输出10~0
*/
public class Test20{
	public static void main(String[] args){
		int i = 10;
		do{
			//循环体
			System.out.println(i);
			i--;
		}while(i>=0);//循环条件
	}
}