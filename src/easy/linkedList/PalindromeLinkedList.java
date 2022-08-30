package easy.linkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {
    //reverse compare
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cur != null){
            a.add(cur.val);
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        for(int num : a){
            if (pre.val != num)
            {
                return false;
            }
            pre = pre.next;
        }
        return true;
    }
}
