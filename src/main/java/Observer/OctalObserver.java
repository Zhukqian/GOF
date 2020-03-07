package Observer;

/**
 * @ClassName OctalObserver
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/7 11:02
 * @Version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public String update() {
        System.out.println("OctalObserver============== "+ Integer.toOctalString( subject.getNum()));
        return "Octal String: "+ Integer.toOctalString( subject.getNum()) ;
    }
}
