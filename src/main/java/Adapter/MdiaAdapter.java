package Adapter;

/**
 * @ClassName MdiaAdapter
 * @Description 通过包装一个需要适配的对象，把原接口转换成目标接口
 * 创建一个适配器,将MdiaPlayer转换成advancedMdiaPlayer
 * 你如:::手机转换器220V-转换成5V     等等
 * @Author zhukq
 * @Date 2020/3/20 11:24
 * @Version 1.0
 */
public class MdiaAdapter implements MdiaPlayer{
    AdvancedMdiaPlayer advancedMdiaPlayer ;
    public MdiaAdapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMdiaPlayer = new VlcPlayer();
        }else if("MP4".equalsIgnoreCase(audioType)){
            advancedMdiaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMdiaPlayer.playVlc(fileName);
        }else if("MP4".equalsIgnoreCase(audioType)){
            advancedMdiaPlayer.PlayMP4(fileName);
        }
    }
}
