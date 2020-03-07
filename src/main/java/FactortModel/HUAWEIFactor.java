package FactortModel;


public class HUAWEIFactor implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }

    @Override
    public PC makePC() {
        return new HuaweiPC();
    }
}
