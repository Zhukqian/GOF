package Decorator;

/**
 * @ClassName ShapeDecorator
 * @Description 创建抽象类接口装饰器
 * @Author zhukq
 * @Date 2020/3/31 10:32
 * @Version 1.0
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
