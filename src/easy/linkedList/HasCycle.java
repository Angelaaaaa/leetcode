package easy.linkedList;

import java.util.HashMap;
import java.util.HashSet;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        while(head!=null){
            if(nodes.contains(head)){
                return true;
            }
            nodes.add(head);
            head = head.next;
        }
        return false;
    }
    public boolean hasCycleFast(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && slow!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
}
