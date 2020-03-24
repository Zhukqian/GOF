由于工作时间加长,决定复习设计模式重新改变一下编码习惯,参考菜鸟教程和一些CSDN文章,总结出来的文章,供自己参考.如有侵权,联系我删除.
----

设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。需要各种不同语言程序员都要掌握学习.要掌握每个设计模式的应用地方,会画出每个设计模式的UML类图
----

##  设计模式在什么地方用得到(重要性)

1:设计模式在软件设计普遍存在,比如大厦和小茅房
大厦设计模式就很多,小茅屋基本不需要复杂设计

2:实际工作中,开发完项目后,客户提出新需求(使用设计模式,项目有很好的扩展性)

3:别人离职,你接手项目怎么维护(要有维护性.可读性,规范性)

4:找工作的时候,大厂面试会问你用哪些设计模式,那个地方用到的,解决什么问题

5:设计模式在软件中哪里:

面向对象(OO)---功能模块[设计模式+算法(数据结构)]---框架[多种设计模式]---模块[服务器集群]


##  设计模式的六大原则

1、开闭原则（Open Close Principle）

开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

2、里氏代换原则（Liskov Substitution Principle）

里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

3、依赖倒转原则（Dependence Inversion Principle）

这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）

这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5、迪米特法则，又称最少知道原则（Demeter Principle）

最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）

合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。

##  设计模式的类型

总共有 23 种设计模式。这些模式可以分为三大类：

 - **创建型模式**（Creational Patterns）:
[单例模式](https://github.com/Zhukqian/GOF#1-单例模式),[工厂模式](https://github.com/Zhukqian/GOF#2-工厂模式),[抽象工厂模式](https://github.com/Zhukqian/GOF#2-工厂模式),[建造者模式](https://github.com/Zhukqian/GOF#3-建造者模式),[原型模式](https://github.com/Zhukqian/GOF#4-原型模式)。

 - **结构型模式**（Structural Patterns）:
[适配器模式](https://github.com/Zhukqian/GOF#5-适配器模式),[桥接模式](https://github.com/Zhukqian/GOF#6-桥接模式),[装饰模式](https://github.com/Zhukqian/GOF#7-装饰者模式),[组合模式](https://github.com/Zhukqian/GOF#8-组合模式),[外观模式](https://github.com/Zhukqian/GOF#9-外观模式),[享元模式](https://github.com/Zhukqian/GOF#10-享元模式),[代理模式](https://github.com/Zhukqian/GOF#11-代理模式)。

 - **行为型模式**（（Behavioral Patterns）:
[模版方法模式](https://github.com/Zhukqian/GOF#21-模板方法模式),[命令模式](https://github.com/Zhukqian/GOF#22-命令模式),[迭代器模式](https://github.com/Zhukqian/GOF#12-迭代器模式),[观察者模式](https://github.com/Zhukqian/GOF#13-观察者模式),[中介者模式](https://github.com/Zhukqian/GOF#14-中介者模式),[备忘录模式](https://github.com/Zhukqian/GOF#15-备忘录模式),[解释器模式](https://github.com/Zhukqian/GOF#16-解释器模式),[状态模式](https://github.com/Zhukqian/GOF#17-状态模式),[策略模式](https://github.com/Zhukqian/GOF#18-策略模式),[责任链模式](https://github.com/Zhukqian/GOF#19-责任链模式),[访问者模式](https://github.com/Zhukqian/GOF#20-访问者模式)


### 1. 单例模式

单例模式，顾名思义就是 一个类只能有一个实例，并且在整个项目中都能访问到这个实例。
主要是为了避免因为创建了多个实例造成资源的浪费，且多个实例由于多次调用容易导致结果出现错误.

特点

    类构造器私有
    持有自己类型的属性
    对外提供获取实例的静态方法

- 饿汉式：[HungrySinglton.java](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Single/HungrySinglton.java)

- 懒汉式: [LazySingle](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Single/LazySingle.java)

- 内部类: [LazySingle](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Single/InnerSingle.java)

- 枚举:   [EnumSingle](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Single/EnumSingle.java)


个人推荐使用:懒汉式双重检验锁,内部类,枚举
都安全,可用


### 2. 工厂模式

工厂顾名思义就是创建产品，根据产品是具体产品还是具体工厂可分为简单工厂模式和工厂方法模式，根据工厂的抽象程度可分为工厂方法模式和抽象工厂模式。该模式用于封装和管理对象的创建，是一种创建型模式。本文从一个具体的例子逐步深入分析，来体会三种工厂模式的应用场景和利弊。

[设计模式之工厂模式（factory pattern）](https://www.cnblogs.com/yssjun/p/11102162.html)

1:简单工厂模式

简单工厂模式最大的优点在于实现对象的创建和对象的使用分离，将对象的创建交给专门的工厂类负责，但是其最大的缺点在于工厂类不够灵活，增加新的具体产品需要修改工厂类的判断逻辑代码，而且产品较多时，工厂方法代码逻辑将会非常复杂。

2. 工厂方法模式(Factory Method)

和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂.
也就是定义一个抽象工厂，其定义了产品的生产接口，但不负责具体的产品，将生产任务交给不同的派生类工厂。这样不用通过指定类型来创建对象了。


3:抽象工厂模式
提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为Kit模式，属于对象创建型模式。

此模式是对工厂方法模式的进一步扩展。在工厂方法模式中，一个具体的工厂负责生产一类具体的产品，即一对一的关系，但是，如果需要一个具体的工厂生产多种产品对象，那么就需要用到抽象工厂模式了。

意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

主要解决：主要解决接口选择的问题。

何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

如何解决：在一个产品族里面，定义多个产品。

关键代码：在一个工厂里聚合多个同类产品。

总结:
上面介绍的三种工厂模式有各自的应用场景，实际应用时能解决问题满足需求即可，可灵活变通，无所谓高级与低级。

此外无论哪种模式，由于可能封装了大量对象和工厂创建，新加产品需要修改已定义好的工厂相关的类，因此对于产品和工厂的扩展不太友好，利弊需要权衡一下。 

- 工厂模式测试类:   [Test](https://github.com/Zhukqian/GOF/blob/master/src/main/java/FactortModel/Test.java)

### 3. 建造者模式

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

介绍

意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。

主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。

何时使用：一些基本部件不会变，而其组合经常变化的时候。

如何解决：将变与不变分离开。

关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。

应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。

优点： 1、建造者独立，易扩展。 2、便于控制细节风险。

缺点： 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。

使用场景： 1、需要生成的对象具有复杂的内部结构。 2、需要生成的对象内部属性本身相互依赖。

>>  注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。

使用建造者模式点餐   ,淘宝购物车,去肯德基点餐，我们可以认为点餐就属于一个建造订单的过程。
我们点餐的顺序是无关的，点什么东西也是没有要求的，可以单点，也可以点套餐，也可以套餐加单点，但是最后一定要点确认来完成订单。



-  建造者代码  [BuiderPatternDemo](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Builder/BuiderPatternDemo.java)

### 4. 原型模式

原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

既然我们知道原型模式的核心就是拷贝对象，那么我们能拷贝一个对象实例的什么内容呢？这就要区分深拷贝和浅拷贝之分了。

（1）浅拷贝：我们只拷贝对象中的基本数据类型（8种），对于数组、容器、引用对象等都不会拷贝

（2）深拷贝：不仅能拷贝基本数据类型，还能拷贝那些数组、容器、引用对象等
    
	浅克隆就是只将值类型的变量复制过去，而引用类型只是复制过去引用。
    深克隆是把值类型和引用类型的变量均开辟一块新的内存区域复制一份出来。


优点: 原型模式是在内存中二进制流的拷贝,要比直接new 一个对象性能好很多,特别是要在一个循环体内产生大量的对象时,原型模式可以更好的体现其有点

缺点: 它的优点也是缺点,直接在内存汇总拷贝,构造函数是不会执行的,在实际开发中,应该注意这个潜在的问题.优点是减少了约束,缺点也是减少了约束,需要再时机应用的时候考虑

意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

主要解决：在运行期建立和删除原型。

何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。 2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。 3、为了避免创建一个与产品类层次平行的工厂类层次时。 4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。

如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。

注意事项：与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。

在Spring框架中应用::
<bean   scope="prototype"/>

默认情况下，从bean工厂所取得的实例为Singleton（bean的singleton属性） Singleton: Spring容器只存在一个共享的bean实例，默认的配置。

Singleton：单例模式，可能会有线程安全的问题  每次访问都是同一个Action对象，数据不安全。

Prototype：原型模式，不存在线程安全的问题    可以保证当有请求的时候都创建一个Action对象

- 原型模式代码::[PrototypePatteenDemo](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Prototype/PrototypePatteenDemo.java)

### 5. 适配器模式

1) 适配器模式(Adapter Pattern)将某个类的接口转换成客户端期望的另一个接口表
示，主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同
工作。其别名为包装器(Wrapper)
2) 适配器模式属于结构型模式
3) 主要分为三类：类适配器模式、对象适配器模式、接口适配器模式

举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。



何时使用： 1、系统需要使用现有的类，而此类的接口不符合系统的需要。 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。 3、通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）

如何解决：继承或依赖（推荐）。

关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。

优点： 1、可以让任何两个没有关联的类一起运行。 2、提高了类的复用。 3、增加了类的透明度。 4、灵活性好。

缺点： 1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
2.由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。 



适配器模式在SpringMVC框架应用的源码剖析
1) SpringMvc 中 的HandlerAdapter,  就使用了适配器模式
2) SpringMVC处理请求的流程回顾
3) 使用HandlerAdapter 的原因分析:
可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，如果需要直接调用
Controller方法，需要调用的时候就得不断是使用if else来进行判断是哪一种子类然后执行。那么
如果后面要扩展Controller，就得修改原来的代码，这样违背了OCP原则。

在Spring MVC中，DispatcherServlet作为用户，HandlerAdapter作为期望接口，具体的适配器实现类用于对目标类进行适配，Controller作为需要适配的类。

为什么要在SpringMVC中使用适配器模式？SpringMVC中的Controller种类众多，不同类型的Controller通过不同的方法来对请求进行处理。如果不利用适配器模式的话，DispatcherServlet直接获取对应类型的Controller，需要的自行来判断，像下面这段代码一样：

```
public interface HandlerAdapter {

    /**
     * 判断此handler是否是此HandlerAdapter支持的类型，每种HandlerAdapter只支持一种类型的handler
     */
    boolean supports(Object handler);

    /**
     * 使用所给的handler处理请求
     */
    ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception;

    long getLastModified(HttpServletRequest request, Object handler);

}

```

主要看前两个方法，其中，handle方法返回ModelAndView，说明它就是真正处理请求的方法。
接下来我们来看HandlerAdapter接口和它的实现类图： 

![](https://img-blog.csdn.net/20180319213234648?watermark/2/text/Ly9ibG9nLmNzZG4ubmV0L2xqdzc2MTEyMzA5Ng==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

我们可以看到，HandlerAdapter有五个实现类，其中继承自AbstractHandlerMethodAdapter的RequestMappingHandlerAdapter就是springMVC中处理请求最重要的类之一。

从上面的类图中，我们不难看出，对于不同类型的Handler，springMVC都实现了不同的HandlerAdapter。我们就从最重要的AbstractHandlerMethodAdapter入手，来看看springMVC是怎么实现不用的HandlerAdapter的。

HandlerAdapter的实现类
首先上代码
```
public abstract class AbstractHandlerMethodAdapter extends WebContentGenerator implements HandlerAdapter, Ordered {

    private int order = Ordered.LOWEST_PRECEDENCE;


    public AbstractHandlerMethodAdapter() {
        // no restriction of HTTP methods by default
        super(false);
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return this.order;
    }


    /**
     * 用instanceof判断此handler是否是HandlerMethod类型
     */
    @Override
    public final boolean supports(Object handler) {
        return (handler instanceof HandlerMethod && supportsInternal((HandlerMethod) handler));
    }

    /**
     * 判断是否支持此HandlerMethod
     */
    protected abstract boolean supportsInternal(HandlerMethod handlerMethod);

    /**
     * 将handler强转为HandlerMethod传入handleInternal方法
     */
    @Override
    public final ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        return handleInternal(request, response, (HandlerMethod) handler);
    }

    /**
     * 实际的处理方法，由子类实现，由所给HandlerMethod处理请求
     */
    protected abstract ModelAndView handleInternal(HttpServletRequest request,
            HttpServletResponse response, HandlerMethod handlerMethod) throws Exception;

    @Override
    public final long getLastModified(HttpServletRequest request, Object handler) {
        return getLastModifiedInternal(request, (HandlerMethod) handler);
    }

    protected abstract long getLastModifiedInternal(HttpServletRequest request, HandlerMethod handlerMethod);

}
```

从源码中，我们可以看到，对于传入的handler，supports方法用了instanceof关键字判断传入的handler类型是否是HandlerMethod类型。那么什么是HandlerMethod呢？

实际上HandlerMethod就是一个bean和方法的包装类，它提供了多种方法可以方便的得到bean的类型和方法的参数与返回值等信息。RequestMappingHandlerAdapter使用HandlerMethod作为handler，实际上就是将用户实现的处理方法(如@RequestMapping修饰的方法)包装起来作为handler实现对请求的处理。

思考与总结
通过HandlerAdapter接口，springMVC还将Servlet、Controller、HttpRequestHandler等类作为handler，实现了相应的适配器类（如上类图）。我们可以从中看出适配器模式相应的优势，例如，当我们需要不同handler处理请求时，我们只需要关注HandlerAdapter的实现类，重写其中的handler方法，就可以完成请求的处理，而不需要关注handler的本身的类型或方法等。
适配器模式很好的将所需要用的类和使用者相解耦，使用者只需要关注相应的适配器接口提供的接口方法即可。
最后，springMVC通过supports和instanceof关键字，最大程度的将handler与相应适配器类解耦，达到了高复用，也可以借鉴学习。

- 适配器模式代码::[AdapterDemo](https://github.com/Zhukqian/GOF/blob/master/src/main/java/Adapter/AdapterDemo.java)


















