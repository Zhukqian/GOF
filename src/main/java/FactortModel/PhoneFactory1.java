package FactortModel;

//简单工厂模式
public class PhoneFactory1 {
    public Phone make(String phone){
        if("xiaomi".equals(phone)){
            return new MIPhone();
        }
        if("huawei".equals(phone)){
            return new HuaweiPhone();
        }

        return null;
    }
}
