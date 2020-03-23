package Bridge;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/20 16:30
 * @Version 1.0
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void drow() {
        drawAPI.drawCircle(radius,x,y);
    }
}
