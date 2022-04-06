/**
 * 二维数组示例:JAVA中没有真正的多维数组，多维数组的表示方式是数组中的元素还是数组。一起来参加尾丝程序员大赛吧，有3个班级各3名学员参赛，
 * 记录每个学员的成绩，并计算每个班的平均分。
 */
public class Test8 {
    public static void main(String[] args) {
        int [][] score= {{18,19,89},{45,85,65},{77,58,65}};//定义一个二维数组
        int classLen = score.length;
        for (int i = 0; i < classLen; i++) {
            int sum = 0;
            int count = score[i].length;
            for (int j = 0; j < count; j++) {
                sum +=score[i][j];
            }
            int avg = sum/count;
            System.out.println("第"+(i+1)+"班的平均成绩是"+avg);
        }
    }
}
