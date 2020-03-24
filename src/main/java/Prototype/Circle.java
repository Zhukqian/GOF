package Prototype;

/**
 * @ClassName Circle
 * @Description 创建扩展了shape抽象类的实体类
 * @Author zhukq
 * @Date 2020/3/24 11:17
 * @Version 1.0
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    void drew() {
        System.out.println("Circle");
    }
}
