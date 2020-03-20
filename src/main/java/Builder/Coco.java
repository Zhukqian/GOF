package Builder;

/**
 * @ClassName coco
 * @Description 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @Author zhukq
 * @Date 2020/3/7 21:05
 * @Version 1.0
 */
public class Coco extends ColdDrink{
    @Override
    public String name() {
        return "COCO饮料";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
