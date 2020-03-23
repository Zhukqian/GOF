package FactortModel;

public class Test {
    public static void main(String[] args) {
        //1  简单工厂模式
        PhoneFactory1 phoneFactory1 = new PhoneFactory1();
        Phone phone1 = phoneFactory1.make("xiaomi");
        //System.out.println(phone1.makePhone());

        //2工厂方法模式
        AbstractFactory mi = new MiFactory();
        AbstractFactory huawei = new HUAWEIFactor();
        //System.out.println(mi.makePhone().makePhone());


        //3:抽象工厂模式(Abstract Factory) 可以添加产品,手机,电脑
        AbstractFactory miAll = new MiFactory();
        System.out.println( miAll.makePC().makePC());
    }
}
