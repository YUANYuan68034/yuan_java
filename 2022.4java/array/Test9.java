/**
 * 求最大值和最小值算法
 */
public class Test9 {
    public static void main(String[] args) {
        int [] num = {12,5,36,78,1};
        int maxNum = max(num);
        System.out.println("最大值为："+maxNum);
        int minNum = min(num);
        System.out.println("最小值为："+minNum);
    }
    //求数列中的最大值
    public static int max(int[] num){
        int max = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }
    //求数列中的最小值
    public static int min(int[] num){
        int min = num[0];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if(num[i]<min){
                min = num[i];
            }
        }
        return min;
    }
}
