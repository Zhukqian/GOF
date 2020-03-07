package Observer;

/**
 * @ClassName BinaryObserver
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/7 10:56
 * @Version 1.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public String update() {
        System.out.println("BinaryObserver========="+Integer.toBinaryString(subject.getNum()));


        return "BinaryObserver............."+Integer.toBinaryString(subject.getNum());
    }
}
