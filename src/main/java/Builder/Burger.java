package Builder;

/**
 * @ClassName Burger
 * @Description 创建实现 Item 接口的抽象类，该类提供了默认的功能。汉堡包简介
 * @Author zhukq
 * @Date 2020/3/7 20:52
 * @Version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing pack() {
        return new Wrapper();
    }

    public abstract float price() ;
}
