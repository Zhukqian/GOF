package Strategy;

/**
 * @ClassName Context
 * @Description 创建 Context 类
 * @Author zhukq
 * @Date 2020/3/6 21:51
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int doSomething(int a,int b){
        return strategy.doSomething(a,b);
    }
}
