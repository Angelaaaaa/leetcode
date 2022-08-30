import easy.linkedList.ListNode;
import easy.linkedList.PalindromeLinkedList;
import easy.xsum.TwoSum;
import org.junit.Test;

import java.util.Arrays;

public class EasyTests {
    @Test
    public void twoSumTest(){
        int[] nums = {1,2,3,4,5};
        int target = 8;
        TwoSum twoSum = new TwoSum();
        assert(Arrays.compare(twoSum.twoSumIterationWay(nums,target), new int[]{2,4}) == 0);
        assert(Arrays.compare(twoSum.twoSumSubstractionWay(nums,target), new int[]{2,4}) == 0);
        assert(Arrays.compare(twoSum.twoSumSmartWay(nums,target), new int[]{2,4}) == 0);
    }

    @Test
    public void isPalindrome(){
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode a = new ListNode(1, null);
        ListNode b = new ListNode(1, a);
        ListNode c = new ListNode(2, b);
        ListNode d = new ListNode(3, c);
        ListNode e = new ListNode(1, d);
        assert(!palindromeLinkedList.isPalindrome(e));

    }
}
