package Strategy;

public class SubstractOperation implements Strategy {
    @Override
    public int doSomething(int a, int b) {
        return a-b;
    }
}
