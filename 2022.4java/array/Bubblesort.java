public class Bubblesort {
    public static void main(String[] args) {
        int[] nums = {12,65,3,56,56,89,65,7};
        int number = 0;
        //外循环轮数
        for (int i = 0; i < nums.length; i++) {
            //内循环比较次数
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    number = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = number;

                }
            }
        }
        //foreach 遍历输出排序后的数组
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
