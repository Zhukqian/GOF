package FactortModel;

public class MiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new MIPhone();

    }

    @Override
    public PC makePC() {
        return new MIPC();
    }
}
