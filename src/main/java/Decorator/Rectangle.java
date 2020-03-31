package Decorator;

/**
 * @ClassName Rectangle
 * @Description 长方形
 * @Author zhukq
 * @Date 2020/3/31 10:30
 * @Version 1.0
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("I am Rectangle");
    }
}
