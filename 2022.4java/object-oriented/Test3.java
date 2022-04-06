/**
 * 构造方法:构造方法是在类中定义的，构造方法的定义格式:方法名称与类名称相同，无返回值类型的声明。
 * 1、构造方法就是类构造对象时调用的方法，用于对象的初始化工作
    2、构造方法是实例化一个类的对象时，也就是new的时候，最先调用的方法
 */
public class Test3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 =new Dog("你好",123);
    }
}

class Dog{
    //默认构造方法,通常有其他构造方法时要保留默认方法
    public Dog(){
        System.out.println("构造方法开始执行");
    }

    public Dog(String name){
        this.name = name;
        System.out.println("带一个参数的构造方法执行了");
    }

    public Dog(String name, int age){
        this(name); //在调用其他构造方法时，此语句需要在第一句
        //this.name = name;
        this.age = age;
        System.out.println("带两个参数的方法执行了");
    }

    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}