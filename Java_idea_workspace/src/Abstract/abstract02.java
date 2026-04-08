/*
IV.模板设计模式(进一步提升代码复用性
    A.定义算法骨架，将方法的实现延迟到具体子类中实现
    B.包含抽象类和具体子类
        1）抽象类定义了模板（抽象方法
        2）具体子类实现抽象类中的抽象方法
 */

/////////////////////////////SE3////////////////////////////
/*
模板设计模式的应用场景也正如其名
设计一个模板
让子类只需继承模板之后实现了抽象方法即可执行不同场景下的相同算法
 */

package Abstract;

public class abstract02
{
    static void main(String[] args) {
        Y y = new Y();
        Z z = new Z();
        y.calculateTime();
        z.calculateTime();
    }
}

abstract class Template
{
    abstract void job();
    public final void calculateTime()
    {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间为"+(end-start));
    }
}

class Y extends Template
{
    public void job()
    {
        long num = 0;
        for (int i = 1; i <= 100000; i++)
        {
            num += i;
        }
    }
}
class Z extends Template
{
    public void job()
    {
        long num = 0;
        for (int i = 1; i <= 100000; i++)
        {
            num *= i;
        }
    }
}
