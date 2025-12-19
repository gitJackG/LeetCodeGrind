class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode auxiliar = new ListNode(0);
        auxiliar.next = head;
        ListNode current = auxiliar;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return auxiliar.next;
    }
}
