package Strategy;

/**
 * 乘法策略类
 */
public class MultiplyOperation implements Strategy{
    @Override
    public int doSomething(int a, int b) {
        return a*b;
    }
}
