/**
while循环  先判断再执行，有可能执行0次
打印100以内所有的奇数，偶数和3的倍数（不包括100）
*/
public class Test19{
	public static void main(String[] args){
		int i = 1;
		int num = 1; //计算总数
		while(i<100){
			if(i%2==0){
				System.out.println("偶数i："+i);
			}else{
				System.out.println("奇数i："+i);
			}
			if(i%3==0){
				System.out.println("3的倍数"+i);
			}
			i++;
		}
	}
}