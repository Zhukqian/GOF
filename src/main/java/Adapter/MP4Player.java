package Adapter;

/**
 * @ClassName MP4Player
 * @Description 播放MP4的播放器
 * @Author zhukq
 * @Date 2020/3/20 11:22
 * @Version 1.0
 */
public class MP4Player implements AdvancedMdiaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void PlayMP4(String fileName) {
        System.out.println("播放Mp4格式音乐+==="+fileName);
    }
}
