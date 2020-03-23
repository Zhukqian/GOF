package Single;

/**
 * @ClassName InnerSingle
 * @Description 内部类单例

 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * 优点：避免了线程不安全，延迟加载，效率高。
 * @Author zhukq
 * @Date 2020/3/23 11:37
 * @Version 1.0
 */
public class InnerSingle {
    private InnerSingle() {
    }


    private static class SingletonInHodler {
        private static InnerSingle singletonIn = new InnerSingle();
    }

    public static InnerSingle getSingletonIn() {
        return SingletonInHodler.singletonIn;
    }


    public static void main(String[] args) {
        InnerSingle innerSingle1= InnerSingle.getSingletonIn();
        InnerSingle innerSingle2= InnerSingle.getSingletonIn();
        System.out.println(innerSingle1==innerSingle2);
    }
}
