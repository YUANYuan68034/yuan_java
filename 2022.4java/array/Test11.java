import java.util.Arrays;

/**
 * Arryas类的使用
 */
public class Test11 {
    public static void main(String[] args) {
        int [] num = {45,78,84,121,154,199};

        //二分查找
        int index = Arrays.binarySearch(num, 154);
        System.out.println("找到的下标是："+index);
        //输出数组
        for (int n : num) {
            System.out.println(n);
        }
        
        //在测试输出数据时 使用 Arrays.toString(num) 输出数组更方便
        System.out.println(Arrays.toString(num));

        //排序
        int[] num2 = {12,54,36,89,65,58};
        Arrays.sort(num2); //快速排序
        System.out.println(Arrays.toString(num2));

        //数组的复制
        int[] num3 = Arrays.copyOf(num2, 8); //多出两位
        System.out.println("数组的复制"+Arrays.toString(num3));

        //复制指定的数组长度
        int[] num4 = Arrays.copyOf(num2, 3);
        System.out.println("复制指定的数组长度"+Arrays.toString(num4));

        //复制指定区间的数组
        int[] num5 = Arrays.copyOfRange(num2, 0,3);
        System.out.println("复制指定区间的数组"+Arrays.toString(num5));

        //
        int[] newNum = new int[num2.length];
        System.arraycopy(num2,0,newNum,0,num2.length);//num2原数组
        System.out.println("使用新数组接受原数组"+Arrays.toString(newNum));
        
        /**
         * 小结，数组的复制，效率由高到低排序是：System.arraycopy>Arrays.copyOf > for
         */

         //判断两个数组的值是否相等
         System.out.println(Arrays.equals(num2, newNum));

         //填充数组
         Arrays.fill(newNum, 0);
         System.out.println("填充数组"+Arrays.toString(newNum));
    }
}
