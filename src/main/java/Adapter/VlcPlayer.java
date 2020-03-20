package Adapter;

/**
 * @ClassName VlcPlayer
 * @Description 播放CLC的播放器
 * @Author zhukq
 * @Date 2020/3/20 11:22
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMdiaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc格式的音乐==="+fileName);
    }

    @Override
    public void PlayMP4(String fileName) {

    }
}
