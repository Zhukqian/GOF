package Builder;

/**
 * @ClassName ChickenBurger
 * @Description 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author zhukq
 * @Date 2020/3/7 21:04
 * @Version 1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "奥尔良烤鸡汉堡包";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}
