/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:25
 *@Description:
 */
package learn.Behavioral.Visitor;

import java.util.ArrayList;

public class CandidateList extends ArrayList<Candidate> {
    public void accept(AwardCheck visitor){
        for (Candidate candidate : this) {
            candidate.accept(visitor);
        }
    }
}
