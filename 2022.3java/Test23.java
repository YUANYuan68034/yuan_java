/**
	for循环
	打印0~200 之间被7整除但不能被4整除的所有整数
*/
public class Test23{
	public static void main(String[] args){
		for(int i=0;i<=200;i++){
			if(i%4!=0 && i%7==0){
				System.out.println(i);
			}
		}
	}
}