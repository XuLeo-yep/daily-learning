////////////////////////SE1////////////////////////////////////
/*
I. why
    A.父类方法的不确定性
        1.父类的方法需要声明，但不明确如何实现 （这是一个动物但是不知道吃什么
II.
    A.抽象的方法就是没有实现的方法——》没有方法体
    B.类中有抽象类需要将类设为抽象类
    C.抽象类一般会被继承，由其子类实现抽象方法
III.details
    A.抽象类不能实例化
    B.抽象类中可以没有抽象方法，可以有非抽象（可实现）的方法
    C.类中包含抽象方法，类必须声明为抽象类
    D.abstract只能修饰类和方法
    E.抽象类还是类，可以有任何成员（非抽象方法、构造器……
    F.抽象类可以被继承，一个类继承了抽象类必须实现所有的抽象方法，除非它也是一个抽象类
    G.抽象方法不能使用private、final、static来修饰（因为抽象方法需要被子类重写来实现）

 */


////////////////////SE2////////////////////////////////////
/*
1.抽象方法——》将方法抽象出来——》没有方法体——》要靠子类重写来实现
——》不能用private、final、static（无法被重写）来修饰
2.抽象类——》没有实例——》new就报错
       ——》抽象类也是类——》与其他类无差别——》子类要么实现抽象方法
                                        ——》要么也是抽象类
3.有抽象方法就一定是抽象类，抽象类里不一定有抽象方法
 */



package Abstract;
///////////////////////EXERCISE/////////////////////////
public class abstract01
{
    static void main(String[] args)
    {
        //new A();
        Manager leo = new Manager("Leo", 1, 1145, 0.20);
        CommonEmployee xu = new CommonEmployee("Xu", 2, 4451);
        leo.work();
        xu.work();
    }
}

abstract class Employee
{
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work();
}

class Manager extends Employee
{
    double bonus;
    public Manager(String name, int id, int salary,double bonus)
    {
        super(name, id, salary);
        this.bonus=bonus;
    }

    @Override
    void work()
    {
        System.out.println("Manager "+name+" is working;");
    }
}
class CommonEmployee extends Employee
{

    public CommonEmployee(String name, int id, int salary)
    {
        super(name, id, salary);
    }

    @Override
    void work()
    {
        System.out.println("CommonEmployee "+name+" is working;");
    }
}


///////////////////////EXERCISE/////////////////////////

////////////////F/////////////////////////////
abstract class A
{
    public abstract void hi();
}
class B extends A
{
    @Override
    public void hi() {

    }
}
abstract class C extends A
{

}
////////////////F/////////////////////////////


abstract class  animal
{
    String name;

    public animal(String name)
    {
        this.name = name;
    }

//可以写为抽象类
//    public void eat()
//    {
//        System.out.println("不知道吃什么");
//    }

    public abstract void eat();


}
