public class Test6 {
    public static void main(String[] args) {
        int[] score = {15,19,46,35};
        //print(null);
        print2(score);
    }
    //测试数组的异常 NullPointerException（空指针）
    public  static void print(int[] x){
        //java.lang.NullPointerException
        //空指针异常
        //当一个变量为null（没有赋值）时，我们去调用了该变量的属性和方法
        System.out.println("数组的长度为："+x.length);
    }
    //测试数组的异常 数组下标越界.ArrayIndexOutOfBoundsException
    public  static void print2(int[] x){
        for (int i = 0; i <= x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
