package Decorator;

/**
 * @ClassName RedShapeDecoratoe
 * @Description 创建扩展了 ShapeDecorator 类的实体装饰类。
 * @Author zhukq
 * @Date 2020/3/31 10:38
 * @Version 1.0
 */
public class RedShapeDecoratoe extends ShapeDecorator{
    public RedShapeDecoratoe(Shape decoratorShape) {
        super(decoratorShape);
    }

    /**
     * 此方法将shape具有更多可能性
     */
    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBroder(decoratorShape);
    }

    private void setRedBroder(Shape decorator){
        System.out.println("Brodor Color:Red ");
    }
}
