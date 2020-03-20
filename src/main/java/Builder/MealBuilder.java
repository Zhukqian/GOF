package Builder;

/**
 * @ClassName MealBuilder
 * @Description 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * 创建两个套餐()
 * 让直接点餐
 * @Author zhukq
 * @Date 2020/3/7 21:17
 * @Version 1.0
 */
public class MealBuilder {

    public Meal getMealOne(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coco());

        return meal;
    }

    public Meal getMealTwo(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coffee());

        return meal;
    }
}
