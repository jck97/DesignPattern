/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  22:21
 *@Description:
 */
package learn.Builder;

public class ConciseMode extends ModeBuilder{

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("简洁模式构建菜单");
    }

    @Override
    public void buildPlaylist() {
        videoPlayer.setPlaylist("简洁模式下构建播放列表");
    }

    @Override
    public void buildWindow() {
        videoPlayer.setWindow("简洁模式下构建窗口");
    }

    @Override
    public void buildStrip() {
        videoPlayer.setStrip("简洁模式下构建滚动条");
    }

    @Override
    public boolean isBuildPlaylist() {
        return false;
    }

    @Override
    public boolean isBuildStrip() {
        return false;
    }
}
