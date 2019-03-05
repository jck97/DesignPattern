/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  22:08
 *@Description:
 */
package learn.Creational.Builder;

public class ModeCtrl {
    public VideoPlayer constructor(ModeBuilder builder){
        builder.buildMenu();
        if (builder.isBuildPlaylist()) {
            builder.buildPlaylist();
        }
        builder.buildWindow();
        if (builder.isBuildStrip()) {
            builder.buildStrip();
        }
        return builder.getVideoPlayer();
    }
}
