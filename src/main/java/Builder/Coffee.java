package Builder;

/**
 * @ClassName Coffee
 * @Description 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author zhukq
 * @Date 2020/3/7 21:02
 * @Version 1.0
 */
public class Coffee extends ColdDrink{
    @Override
    public String name() {
        return "咖啡饮料";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
