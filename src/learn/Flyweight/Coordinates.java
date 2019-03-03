/****
 *@Author: JinCh
 *@Date: Created in 2019/3/3  11:23
 *@Description:
 */
package learn.Flyweight;

public class Coordinates {
    private int x;
    private int y;
    private int width;
    private int height;

    public Coordinates() {
    }

    public Coordinates(int x, int y,int width,int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width =  width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
