/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  21:50
 *@Description:
 */
package learn.Creational.Builder;

import java.io.*;

public class VideoPlayer implements Serializable{
    private String menu;
    private String playlist;
    private String window;
    private String strip;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getStrip() {
        return strip;
    }

    public void setStrip(String strip) {
        this.strip = strip;
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "menu='" + menu + '\'' +
                ", playlist='" + playlist + '\'' +
                ", window='" + window + '\'' +
                ", strip='" + strip + '\'' +
                '}';
    }
    //使用序列化技术实现深克隆
    public VideoPlayer deepClone() throws IOException, ClassNotFoundException {
        //写入流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //读出元素
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (VideoPlayer) ois.readObject();
    }

}
