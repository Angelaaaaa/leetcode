package easy.linkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
       if (head == null || head.next == null)
           return head;
       else {
           ListNode cur = head;
           ListNode pre = null;
           ListNode temp = null;
           while (cur != null){
               temp = cur.next;
               cur.next = pre;
               pre = cur;
               cur = temp;
           }
           return pre;
       }
    }
}
