package Builder;

/**
 * @ClassName BuiderPatternDemo
 * @Description BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
 * 测试点餐效果
 *
 * 去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。
 * 我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，也可以套餐加单点，但是最后一定要点确认来完成订单。
 *
 *
 * @Author zhukq
 * @Date 2020/3/7 21:24
 * @Version 1.0
 */
public class BuiderPatternDemo {
    public static void main(String[] args) {

        //显示套餐一信息
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.getMealOne();
        System.out.println("meal1+++++++++=========");
        meal1.showItem();
        System.out.println("meal1价格为:::::::"+meal1.getMoney());


        //显示套餐二
        Meal meal2 = mealBuilder.getMealTwo();
        System.out.println("meal2+++++++++=========");
        meal2.showItem();
        System.out.println("meal2价格==="+meal2.getMoney());
    }
}
