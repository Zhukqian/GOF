package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author zhukq
 * @Date 2020/3/7 10:46
 * @Version 1.0
 */
public class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        niotifyAll();
    }

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    private void niotifyAll() {
        for(Observer observer:list){
            observer.update();
        }
    }
}
