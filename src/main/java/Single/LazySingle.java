package Single;

/**
 * @ClassName LazySingle
 * @Description 懒汉式单例

 * @Author zhukq
 * @Date 2020/3/23 10:12
 * @Version 1.0
 */
//懒汉式安全
public class LazySingle {

    private LazySingle(){}

    private static LazySingle lazySingle;

/*    public static synchronized LazySingle getLazySingle(){
        if(lazySingle==null){
            lazySingle =  new LazySingle();
        }{
            return lazySingle;
        }

    }*/
// 懒汉式 第二种写法 效率高    双重检验锁
    public static LazySingle getLazySingle(){
        if(lazySingle==null){
            synchronized (LazySingle.class){
                if(lazySingle==null){
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}
class SingletonTest {
    public static void main(String[] args) {
        LazySingle sl1 = LazySingle.getLazySingle();
        LazySingle sl2 = LazySingle.getLazySingle();
        System.out.println(sl1 == sl2);
    }
}
