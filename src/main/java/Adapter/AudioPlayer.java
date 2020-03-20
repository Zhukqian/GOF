package Adapter;

/**
 * @ClassName MediaPlayer
 * @Description 使用适配器类 MediaAdapter 传递所需的音频类型，不需要知道能播放所需格式音频的实际类
 * @Author zhukq
 * @Date 2020/3/20 11:32
 * @Version 1.0
 */
public class AudioPlayer implements MdiaPlayer{
    MdiaAdapter mdiaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //默认支持播放mp3格式
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("播放"+audioType+"    歌曲名=="+fileName);
        }

        //适配器支持的格式
        else if("mp4".equalsIgnoreCase(audioType)||"vlc".equalsIgnoreCase(audioType)){
            mdiaAdapter = new MdiaAdapter(audioType);
            mdiaAdapter.play(audioType,fileName);
        }
        else {
            System.out.println("未知格式");
        }
    }
}
