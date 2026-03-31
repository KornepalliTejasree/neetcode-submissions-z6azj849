class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return change(l1, l2);
    }

    public ListNode change(ListNode l1, ListNode l2) {

        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        while (l1 != null) {
            s.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s1.append(l2.val);
            l2 = l2.next;
        }

        s.reverse();
        s1.reverse();

        java.math.BigInteger n1 = new java.math.BigInteger(s.toString());
        java.math.BigInteger n2 = new java.math.BigInteger(s1.toString());
        java.math.BigInteger sum = n1.add(n2);

        StringBuilder st = new StringBuilder(sum.toString());
        st.reverse();

        ListNode dummy = new ListNode(st.charAt(0) - '0');
        ListNode curr = dummy;

        for (int i = 1; i < st.length(); i++) {
            curr.next = new ListNode(st.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy;
    }
}
