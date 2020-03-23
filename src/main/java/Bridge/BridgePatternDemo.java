package Bridge;

/**
 * @ClassName BridgePatternDemo
 * @Description     桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 *
 * 总的来说就是将abstract和implement之间架一座桥,在抽象累的有参构造里面放入接口
 * 将n*m     改成了n+m
 * @Author zhukq
 * @Date 2020/3/20 16:31
 * @Version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.drow();
        greenCircle.drow();
    }
}
