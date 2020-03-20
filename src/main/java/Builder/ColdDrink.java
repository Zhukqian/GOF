package Builder;

/**
 * @ClassName ColdDrink
 * @Description 创建实现 Item 接口的抽象类，该类提供了默认的功能。饮料简介
 * @Author zhukq
 * @Date 2020/3/7 20:59
 * @Version 1.0
 */
public abstract class ColdDrink implements Item{


    @Override
    public Packing pack() {
        return new Bottle();
    }

    public abstract float price();
}
