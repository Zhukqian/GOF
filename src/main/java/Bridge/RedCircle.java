package Bridge;

/**
 * @ClassName RedCircle
 * @Description 具体实现类,红色圆
 * @Author zhukq
 * @Date 2020/3/20 16:27
 * @Version 1.0
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
