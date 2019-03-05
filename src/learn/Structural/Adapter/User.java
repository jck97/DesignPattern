/****
 *@Author: JinCh
 *@Date: Created in 2019/2/27  10:16
 *@Description:
 */
package learn.Structural.Adapter;

public class User {
    private String username;
    private String pw;

    public User(String username, String pw) {
        this.username = username;
        this.pw = pw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
