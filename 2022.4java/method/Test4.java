public class Test4 {
    public static void main(String[] args) {
        int result = add(10,20);
        //float result = add(15,20);方法名相同，参数列表不同，返回值不能作为重载的条件。
        System.out.println(result);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static float add(float a,float b){
        return a+b;
    }
}
