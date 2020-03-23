package Single;

/**
 * @ClassName EnumSingle
 * @Description 枚举单例
 * 这里SingletonEnum.instance
 * 这里的instance即为SingletonEnum类型的引用所以得到它就可以调用枚举中的方法了。
借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * @Author zhukq
 * @Date 2020/3/23 14:39
 * @Version 1.0
 */
public enum EnumSingle {
    instance;

    private EnumSingle() {
    }

    public void whateverMethod() {

    }


    public static void main(String[] args) {
        EnumSingle.instance.whateverMethod();

    }
}
