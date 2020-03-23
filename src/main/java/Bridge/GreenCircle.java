package Bridge;

/**
 * @ClassName GreenCircle
 * @Description 具体实现类,绿色圆
 * @Author zhukq
 * @Date 2020/3/20 16:28
 * @Version 1.0
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
