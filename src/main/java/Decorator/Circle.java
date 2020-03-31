package Decorator;

/**
 * @ClassName Circle
 * @Description 接口实现类,创建圆形
 * @Author zhukq
 * @Date 2020/3/31 10:31
 * @Version 1.0
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("i am Circle");
    }
}
