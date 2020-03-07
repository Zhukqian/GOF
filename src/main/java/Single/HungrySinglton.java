package Single;

public class HungrySinglton {
    private static HungrySinglton hungrySinglton = new HungrySinglton();
    private HungrySinglton(){}
    public HungrySinglton getHungrySinglton(){
        return hungrySinglton;
    }
}
