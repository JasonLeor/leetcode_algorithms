package jason;

/**
 * Created by suliguo on 2017/3/23.
 */

public class AddTowNumbers_2 {

    public ListNode solution(ListNode l1,ListNode l2){

        return null;
    }

    /**
     * 连表结构
     */
    class ListNode{
        int val;
        ListNode nextNode;
        ListNode(int val){
            this.val=val;
            this.nextNode=null;
        }
        public ListNode next(){
            return this.nextNode;
        }
    }
}
