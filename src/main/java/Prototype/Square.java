package Prototype;

/**
 * @ClassName Square
 * @Description 创建扩展了shape抽象类的实体类
 * @Author zhukq
 * @Date 2020/3/24 11:16
 * @Version 1.0
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    void drew() {
        System.out.println("Square");
    }
}
