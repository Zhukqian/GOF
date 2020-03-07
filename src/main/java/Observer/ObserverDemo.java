package Observer;

/**
 * @ClassName ObserverDemo
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/7 11:04
 * @Version 1.0
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);


        subject.setNum(2);
    }
}
