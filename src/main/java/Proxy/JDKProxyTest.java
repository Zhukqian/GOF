package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//JDK动态代理
interface Tree{
    void buy();
}

/**
 * 需要代理的类
 */
class MyTree implements  Tree{
public MyTree(){}
    @Override
    public void buy() {
        System.out.println("我要买树");
    }
}

//动态代理类,什么类都能代理,只要继承这个接口

class JDKProxyHandler implements InvocationHandler{
    /**
     * 这个就是我们要代理的真实对象
     */
    private Object object;
    public JDKProxyHandler(){
        super();
    }
    public JDKProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理买树之前干些啥");
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(object);
        System.out.println("买树之后干些啥");
        return null;
    }
}

public class JDKProxyTest {
    public static void main(String[] args) {
        //代理的真实对象
        MyTree tree = new MyTree();
/*
  InvocationHandlerImpl 实现了 InvocationHandler 接口，并能实现方法调用从代理类到委托类的分派转发
  其内部通常包含指向委托类实例的引用，用于真正执行分派转发过来的方法调用.
  即：要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法
 */
        JDKProxyHandler JJproxy = new JDKProxyHandler(tree);
        /*
          该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
         */
        Tree treeProxy = (Tree)java.lang.reflect.Proxy.newProxyInstance(tree.getClass().getClassLoader(),
                tree.getClass().getInterfaces(),
                JJproxy);
        treeProxy.buy();

    }
}
