package Decorator;

/**
 * @ClassName DecoratorPatternDemo
 * @Description 使用 RedShapeDecorator 来装饰 Shape 对象。
 * @Author zhukq
 * @Date 2020/3/31 10:51
 * @Version 1.0
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        //周边为红色的圆
        ShapeDecorator redCircle = new RedShapeDecoratoe(new Circle());
        redCircle.draw();

        //周边为红色的长方形
        ShapeDecorator redRectangle = new RedShapeDecoratoe(new Rectangle());
        redRectangle.draw();
    }
}
