/**
 * 打印多重循环
 * 打印直角三角形
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Test25 {
    public static void main(String[] args) {
        //外循环控制行数
        for (int i = 1; i <=5 ; i++) {
            //内循环控制列数
            for (int j = 5; j >0; j--) {
                if(j<=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
