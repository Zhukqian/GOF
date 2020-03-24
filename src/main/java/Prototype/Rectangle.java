package Prototype;

/**
 * @ClassName Rectangle
 * @Description ,创建扩展了shape抽象类的实体类
 * @Author zhukq
 * @Date 2020/3/24 11:08
 * @Version 1.0
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void drew() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
