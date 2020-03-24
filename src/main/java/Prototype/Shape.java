package Prototype;

/**
 * @ClassName Shape
 * @Description 创建一个实现了 Cloneable 接口的抽象类。
 * @Author zhukq
 * @Date 2020/3/24 11:02
 * @Version 1.0
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void drew();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
