/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public ListNode reverseList(ListNode head) {
       if(head==null) return null;
        return  change(head);
    }
    public ListNode change(ListNode head){
        if(head==null) return null;
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        //Collections.sort(list);
       // System.out.print(list);
        Collections.reverse(list);
        // System.out.print(list);
        ListNode dummy=new ListNode(list.get(0));
        ListNode curr=dummy;
        int n=1;
        while(n<list.size()){
            curr.next=new ListNode(list.get(n));
            curr=curr.next;
            n++;
        } 
        return dummy;
    }
}
