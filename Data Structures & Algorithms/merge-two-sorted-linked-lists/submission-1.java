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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        return change(list1,list2);
    }
    public ListNode change(ListNode list1,ListNode list2){
        ArrayList<Integer> list=new ArrayList<>();
        while(list1!=null){
            list.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            list.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(list);
        if (list.size() == 0) return null;
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