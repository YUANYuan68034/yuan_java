import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要输入的星星行数：");
        int line = input.nextInt();
        printStr(line);
    }

    /**
     *  带参数的方法
     * 形参：在方法定义的参数成为形参,定义多个形参用逗号分开
     * @param line
     */
    public static void printStr(int line) {
        //外循环控制行数
        for (int i = 1; i <= line ; i++) {
            //内循环控制列数
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
