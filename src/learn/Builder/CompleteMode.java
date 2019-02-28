/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  21:56
 *@Description:
 */
package learn.Builder;

public class CompleteMode extends ModeBuilder {

    @Override
    public void buildMenu() {
        videoPlayer.setMenu("完整模式构建菜单");
    }

    @Override
    public void buildPlaylist() {
        videoPlayer.setPlaylist("完整模式下构建播放列表");
    }

    @Override
    public void buildWindow() {
       videoPlayer.setWindow("完整模式下构建窗口");
    }

    @Override
    public void buildStrip() {
        videoPlayer.setStrip("完整模式下构建滚动条");
    }
}
