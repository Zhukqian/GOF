package Strategy;

/**
 * @ClassName StrategyDemo
 * @Description 测试类
 * 减少写if()else{}
 * 策略模式定义了一系列的算法，并将每一个算法封装起来，使每个算法可以相互替代，使算法本身和使用算法的客户端分割开来，相互独立。
 * 参考::https://blog.csdn.net/zx_android/article/details/79157767
 *
 *
 * 比如电商支付选择(微信,支付宝支付)
 * 比如上品折扣,购物车结算(多种选择)
 * @Author zhukq
 * @Date 2020/3/6 21:56
 * @Version 1.0
 */
public class StrategyDemo {
    public static void main(String[] args) {
        //调用加法(此处可以扩展,比如满减   满100减0块)
        Context addcontext = new Context(new AddOperation());
        System.out.println("1+1===="+addcontext.doSomething(1,1));

        //调用减法(比如,满100减90)
        Context substractcontext = new Context(new SubstractOperation());
        System.out.println("10-3======"+substractcontext.doSomething(10,3));


        //调用乘法(比如::::满100返利10)
        Context multiplycontext = new Context(new MultiplyOperation());
        System.out.println("3*3======"+substractcontext.doSomething(3,3));


    }
}
