package Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//CGlab动态代理需要引入CGlab   jar包    使用Enhancar代理调用

/**
 * 需要代理的类
 */
class MyFlower {
    public MyFlower(){}
    public void buy() {
        System.out.println("我要买话");
    }
}

/**
 * CGLAB继承方法拦截器
 */
class CglabProxy implements MethodInterceptor {

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始事务...");

        //执行目标对象的方法
        Object returnValue = proxy.invokeSuper(obj, args);

        System.out.println("结束事务...");

        return returnValue;
    }
}



public class CGLABProxyTest {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyFlower.class);
        enhancer.setCallback(new CglabProxy());
        MyFlower myFlower = (MyFlower) enhancer.create();
        myFlower.buy();
    }
}
