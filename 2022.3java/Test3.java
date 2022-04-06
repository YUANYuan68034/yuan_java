public class Test3{
	public static void main(String[] args){
		System.out.println("转义字符测试");
		System.out.println("我想输出一个换行符\n");  //转移符号 \n换行，将当前位置移到下一行开头
		System.out.println("我想输出一个回车符\r");  //转移符号  \r回车 将当前位置移到本行开头
		System.out.println("\t这是一个制表符"); // 水平制表(HT)(跳到下一个TAB位置)
		System.out.println("\\");  //代表一个反斜线字符"\'
		System.out.println("输出双引号\"你好\"");
		System.out.println("输出单引号\'你好\'");
	}
}