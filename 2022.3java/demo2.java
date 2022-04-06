/**
 do while循环:先执行,再判断,最少执行一次
 2、Java阶乘求和1!＋2!＋...+10!
 */

public class demo2 {
    public static void main(String[] args) {
        int i = 1;
        int num = 0;
        do{
            int j = 1;
            int jc =1;
            while (j <=i){
                jc *= j;
                j++;
            }
            i++;
            num += jc;
        }
        while (i <= 10);
        System.out.println(num);
    }
}
