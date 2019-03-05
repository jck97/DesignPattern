/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  22:26
 *@Description:
 */
package learn.Creational.Builder;

public class ConcisestMode extends ModeBuilder {
    @Override
    public void buildMenu() {
        //还可以重写buildXXX避免使用钩子函数。具体使用因该看情况。
        // 学习设计模式不是依葫芦画瓢，而是使用他的思想
        //videoPlayer.setMenu("最简模式构建菜单");
    }

    @Override
    public void buildPlaylist() {
        videoPlayer.setPlaylist("最简模式下构建播放列表");
    }

    @Override
    public void buildWindow() {
        videoPlayer.setWindow("最洁模式下构建窗口");
    }

    @Override
    public void buildStrip() {
        videoPlayer.setStrip("最洁模式下构建滚动条");
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
