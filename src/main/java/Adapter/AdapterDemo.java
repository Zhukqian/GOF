package Adapter;

/**
 * @ClassName AdapterDemo
 * @Description 使用 AudioPlayer 来播放不同类型的音频格式。
 * 适配器模式是补救措施，所以在系统设计过程中请忘掉这个设计模式，这个模式只是在你无可奈何时的补救方式。
 * @Author zhukq
 * @Date 2020/3/20 11:38
 * @Version 1.0
 */
public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","茉莉花");
        audioPlayer.play("vlc","雷神2");
        audioPlayer.play("mp4","泰囧");
        audioPlayer.play("dox","linux学习手册");
    }
}
