class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        int balance = 0;
        while(true){
            int val = l1.val + l2.val + balance;
            listNode.val = val %10;
            balance = val /10;
            if (l1.next == null && l2.next == null && balance == 0) break;
            if(l1.next == null) l1.val =0;
            else l1 = l1.next;

            if (l2.next == null) l2.val =0;
            else l2 = l2.next;
             ListNode iter = new ListNode();
             listNode.next = iter;
             listNode = iter;
        }
        return head;

    }
}
public class Main {

    public static void main(String[] args) {
    }
}
