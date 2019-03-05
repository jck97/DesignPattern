/****
 *@Author: JinCh
 *@Date: Created in 2019/3/5  10:32
 *@Description:
 */
package learn.Behavioral.Iterator;

import learn.entity.User;

public class VipList {
    private User[] users;

    public VipList(User[] users) {
        this.users = users;
    }

    public PageIterator getIterator(){
        return new VipIterator(this);
    }

    public User[] getUsers() {
        return users;
    }
    public class VipIterator implements PageIterator {
        private int num = -1;
        private int cur = 0;
        private VipList targetList;

        private VipIterator(VipList targetList) {
            this.targetList = targetList;
        }

        @Override
        public void paging(int num) {
            this.num = num;
        }

        @Override
        public boolean hasNext() {
            return cur<users.length;
        }

        @Override
        public Object[] nextPage() {
            assert num > 0;
            int len = Math.min(users.length-cur,num);

            User[] res = new User[len];
            System.arraycopy(users,cur,res,0,len);
            cur+=len;
            return res;
        }
    }
}
