/**
 * 数组的定义：一组能够存储相同数据类型的数据集合。
 * 数组一定要有长度
 * 数组中的每个数据成为元素
 * 数组元素的位置从0开始
 * 数组中的位置称为下标
 */
public class Test5 {
    public static void main(String[] args) {
        //第一种方式
        int[] nums = new int[5];
        /*nums[0] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;*/
        for (int i = 0; i < 5; i++) {
            nums[i] = i + 1;
        }

        //第二种
        //int[] num2;
        //num2 = new int[5];

        //第三种
        //int[] num3 = new int[]{1,2,3,4,5};

        //第四种
        int[] nums4 = {1,2,3,4,5};
        //所有的数组都有一个属性 length

        for (int i = 0; i < nums4.length; i++) {
            int number = nums4[i];
            System.out.println(number);
        }
        //forearch jdk1.5新增的特性
        for(int x:nums4){
            System.out.println(x);
        }
    }
}
