///////////////////////////SE1////////////////////////////////
/*
I.intro
1)接口就是给出一些没有实现的方法，封装到一起，到某个类要实现的时候，再根据实际情况写出来
2）jdk8.0以后接口中可以有静态方法 默认方法 ，也就是说接口中可以有具体的方法
3）class implements interface 该class要实现抽象方法

II.details
1）接口中写抽象方法可以省略abstract
2）接口中的非抽象方法需要用static || default 修饰
3）普通类实现接口，必须实现该接口所有方法//alt+enter快速补全
4）抽象类implements接口，可以不用实现接口方法
5）一个类可以实现多个接口
6）接口中的属性都是是public static final修饰//static的属性 可以直接由 类名.属性名来访问
7）接口不能继承类，但是可以继承别的接口

III.
1)接口管理
    a.规定方法名
    b.implements后可以统一管理

IV. implements vs extends
1）实现机制是对单继承的补充
2）解决问题不同
    a.继承解决代码复用性和可维护行 子类is a kind of 父类 （血缘关系
    b.接口 like a (技能赋能

V.poly
1）多态参数
2）多态数组
 */

///////////////////////////SE2////////////////////////////////

/*
继承强调共性
接口附加能力

 */

package Interface;

public class interface01
{
    static void main(String[] args)
    {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("*******************************");
        computer.work(camera);


    }
}

class Camera implements UsbInterface
{
    @Override
    public void start()
    {
        System.out.println("camera begins working");
    }

    @Override
    public void stop()
    {
        System.out.println("camera stop working");
    }
}

class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("phone begins working");
    }

    @Override
    public void stop() {
        System.out.println("phone stop working");
    }
}
class Computer
{
    public void work(UsbInterface usbInterface)
    {
        usbInterface.start();
        usbInterface.stop();
    }
}

interface UsbInterface
{
    int i = 1;
    public void start();
    public void stop();

}