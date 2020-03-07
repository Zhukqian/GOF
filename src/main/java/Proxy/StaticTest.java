package Proxy;

/**
 * 静态代理代码
 */
    interface Car{
        void buy();
    }

/**
 * 需要代理的类
 */
class Mycar implements  Car{

    @Override
    public void buy() {
        System.out.println("我要客户买车");
    }
}

/**
 * 代理类
 */
class ProxyCar implements Car{
    //代理队形
    private Mycar mycar;

    public  ProxyCar(Mycar mycar){
        this.mycar = mycar;
    }
    @Override
    public void buy() {
        System.out.println("代理买之前做一些事情");
        mycar.buy();
        System.out.println("买之后做一些事情");
    }
}


public class StaticTest {
    public static void main(String[] args) {
        Car car = new ProxyCar(new Mycar());
        car.buy();
    }

}