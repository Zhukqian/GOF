package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Meal
 * @Description 创建一个 Meal 类，带有上面定义的 Item 对象。
 * @Author zhukq
 * @Date 2020/3/7 21:08
 * @Version 1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getMoney(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for(Item item:items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.pack().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
