/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  21:57
 *@Description:
 */
package learn.Creational.Builder;
public abstract class ModeBuilder {
    protected VideoPlayer videoPlayer;
    public abstract void buildMenu();
    public abstract void buildPlaylist();
    public abstract void buildWindow();
    public abstract void buildStrip();

    public ModeBuilder(){
        videoPlayer = new VideoPlayer();
    }

    public boolean isBuildMenu(){
        //钩子方法
        return true;
    }
    public boolean isBuildPlaylist(){
        return true;
    }
    public boolean isBuildStrip(){
        return true;
    }

    public VideoPlayer getVideoPlayer() {
        return videoPlayer;
    }
}
