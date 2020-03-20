package Builder;

/**
 * @ClassName VegBurger
 * @Description 创建蔬菜汉堡包
 * @Author zhukq
 * @Date 2020/3/7 21:01
 * @Version 1.0
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡包";
    }

    @Override
    public float price() {
        return 20.6f;
    }
}
