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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode dummy=change(head);
        ListNode curr=head;
        ListNode temp=dummy;
        while(curr!=null && temp!=null){
            curr.val=temp.val;
            curr=curr.next;
            temp=temp.next;
        }
    }
    public ListNode change(ListNode head){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        ListNode curr1=head;
        while(curr1!=null){
            list1.add(curr1.val);
            curr1=curr1.next;
        }
       for(int i=0;i<(list1.size()+1)/2;i++){
        list2.add(list1.get(i));
       }
       for(int i=((list1.size()+1)/2);i<list1.size();i++){
        list3.add(list1.get(i));
       }
        Collections.reverse(list3);
        for(int i=0;i<list3.size();i++){
            list4.add(list2.get(i));
            list4.add(list3.get(i));
        }
        if(list4.size()!=list1.size()) list4.add(list2.get(list2.size()-1));
        if (list4.size() == 0) return null;
        ListNode dummy=new ListNode(list4.get(0));
        ListNode curr=dummy;
        int n=1;
        while(n<list4.size()){
            curr.next=new ListNode(list4.get(n));
            curr=curr.next;
            n++;
        }
    return dummy;
    }
}
