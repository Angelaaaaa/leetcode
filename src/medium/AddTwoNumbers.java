package medium;

import easy.linkedList.ListNode;

//hint: return dummyHead.next
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null || l2 != null ||carry != 0){
           int cur1 = l1 == null ? 0 : l1.val;
           int cur2 = l2 == null ? 0 : l2.val;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            int sum = cur1 + cur2 + carry;
            if (sum > 10) {
                sum = sum - 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
        }
        return dummyHead.next;
    }

}
