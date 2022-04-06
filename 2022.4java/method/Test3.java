import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year1 = input.nextInt();
        boolean bool =  isRunNian(year1);
        if(bool){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

        print();
    }

    public static boolean isRunNian(int year){
        if (year %4==0 &&year %100!= 0 || year %400==0) {
            return true;
        }else {
            return false;
        }

    }

    public static void print(){
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;   //表示方法结束
            }
            System.out.println(i);
        }
    }
}
