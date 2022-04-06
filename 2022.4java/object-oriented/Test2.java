/**
 * 如果属性没有封装，那么在本类之外创建对象后，可以直接访问属性
 * private 关键字 ： 访问权限修饰符。  public表示共有的 private表示私有的
 * 私有的属性和方法只能在本类中访问  公有的属性和方法，可以被类外部的其它类访问
 * 想要在类外部访问私有属性，我们需要提供公有方法来间接访问
 * 通常在一个类中属性都私有化，对外提供
 */
public class Test2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.name = "小明";
        //p1.age = 18;
        p1.setName("小明");
        p1.setAge(18);
        p1.run(15);
        
    }
}

//没有封装之前
class Person{
    //属性的封装  
    private String name;  //成员变量，在类中定义
    private int age; //成员变量，在类中定义

    //gettter and setter

    //这是对外提供一个name属性设值方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void run(int len){ //参数也是局部变量
        int m = len;
        System.out.println("我跑了"+m);
    }
}