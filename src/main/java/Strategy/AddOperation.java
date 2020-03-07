package Strategy;

/**
 * add策略类
 */
public class AddOperation implements Strategy{
    @Override
    public int doSomething(int a, int b) {
        return a+b;
    }
}
