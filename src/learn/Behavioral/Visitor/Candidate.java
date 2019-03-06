/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:13
 *@Description:
 */
package learn.Behavioral.Visitor;

public abstract class Candidate {
    protected int paperNum;
    protected int score;

    public abstract void accept(AwardCheck visitor);

    public Candidate(int paperNum, int score) {
        this.paperNum = paperNum;
        this.score = score;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "paperNum=" + paperNum +
                ", score=" + score +
                '}';
    }
}
