package Bridge;

/**
 * @ClassName Shape
 * @Description 抽象化角色：使用实现者角色提供的接口来定义基本功能接口。
 * 具体的实现是RedCircle、GreenCircle，它们的抽象类为Shape，按一般逻辑来说，我们是直接继承Shape来创建不同的具体对象，
 * 但桥接模式中是通过“桥梁”DrawAPI建立抽象与具体实现之间的联系，调用DrawAPI中的方法来具体实现。
 *
 * 猪八戒投胎，灵魂在河的一边，河对面有两个肉体，红猪和绿猪；
 *
 * 灵魂需要过桥，选择红猪的肉体或者绿猪的肉体完成投胎。
 *
 * 在上面的例子中，红猪和绿猪就是 RedCircle 和 GreenCircle，灵魂是 Circle 类，而那座桥就是 drawAPI 这个接口。
 * @Author zhukq
 * @Date 2020/3/20 16:28
 * @Version 1.0
 */
public abstract  class Shape {
    public DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void drow();
}
