public class Test1{
	public static void main(String[] args){
		getMenu(); //调用方法，此时方法才会执行
	}
	//public 访问权限修饰符
	//static  静态修饰符，描述的方法可以直接调用
	//void  返回值  无返回值
	//getMenu() 方法名
	//定义一个方法，在没有调用时不会执行
	public static void getMenu() {
		System.out.println("-----菜单-----");
		System.out.println("1、蛋炒饭");
		System.out.println("2、炒米粉");
		System.out.println("3、哈哈哈");
	}
}