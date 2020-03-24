package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ShapeCache
 * @Description 创建一个类,可以冲数据库回去实体类,并把它存在hashMap
 * @Author zhukq
 * @Date 2020/3/24 11:19
 * @Version 1.0
 */
public class ShapeCache {
    private static Map<String,Shape> shapeMap = new HashMap<String,Shape>();

    /**
     * 我们获取到对象之后,clone对象来使用
     * @param shapeId
     * @return
     */
    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }


    //这里可以进行数据库操作等,将查询或者获取的数据,put到hashMap

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }



}
