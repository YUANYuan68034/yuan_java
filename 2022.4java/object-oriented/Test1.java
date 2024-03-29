public class Test1 {
    public static void main(String[] args) {
       Horse h= null; //声明一个类的变量（除了八种基本数据类型以外，都属引用类型，包括数组）
       Horse h2 = null;
    
       //创建一个 Horse 类型的对象，实例对象
       h = new Horse();
       //有了属性，我么就可以调用对象的属性和方法
       h.name = "小白";
       h.age = 4;
       h.run(); //调用方法
       h.eat();
        //匿名对象：只能使用一次，用完后，该对象就会被释放
        new Horse().eat();

        //h = null;//把对象释放
        //h.eat();//当对象不存在时，调用对象的属性方法会报错（空指针）

        h2 = h;//对象之间的赋值，相同类型才可以赋值
        h2.name = "小黑";
        System.out.println(h.name);//指向同一堆内存 所以h.name的值等于h2.name “小黑”


        System.out.println("-------------------------");

        Horse h3 = null;
        Horse h4 = null;
        h3 = new Horse();
        h4 = new Horse();
        h3.name = "小白";
        h3.age= 4;
        h4.name = "小黑";
        h4 = h3;
        h4.name = "嘿嘿";
        System.out.println(h3.name);
    }

}
//自定义一个类（类型）
class Horse{
    //在类中定义属性（特征）
    String name; //字符串是引用类型变量，不是基本数据类型
    int age;

    public void run(){
        System.out.println("我是"+name+"我"+age+"岁");
    }
    public void eat(){
        System.out.println("我吃草我吃草！");
    }
}