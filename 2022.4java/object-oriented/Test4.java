/**
 * this关键字
 *  1.调用类的属性
    2.调用类的方法
    3.表示当前对象
    表示当前对象:在访法被调用的过程中，哪个对象调用了方法，在方法内的this就表示谁
 */
public class Test4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("咪咪咪");
        cat.setAge(12);
    }
}

class Cat{

    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;  //this表示当前对象  谁调用就是谁  此this的对象为cat
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}