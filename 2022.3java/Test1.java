public class Test1{
	public static void main(String[] args){
		int num = 10; //局部变量
		//int 纷纷 = 20; //不建议使用
		
		//八种数据类型
		
		//数值类型
		byte b = 10;  //占用1个字节，取值范围  -128~127
		short s = 10;  //占用2个字节 取值范围  -32768~32767，在实际开发使用较少
		int i = 10;  //占用4个字节  取值范围（一般不用记）   -2147483648~2147483647
		long lon = 100L; //占用8个字节
		float f = 10.98F; //占用4个字节  单精度类型
		double d = 10.123456D;  //占用8个字节  双精度类型
		
		
		char c = 'A';  //占用2个字节， 范围0~65535
		boolean bool = true;//占用字节不确定
		
		//定义变量的格式
		//类型 变量名； //声明一个变量
		b = 20;  //赋值
		
		char c2 = 97; //ascii码表
		System.out.println(c2);
	}
}