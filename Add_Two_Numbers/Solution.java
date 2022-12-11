/**
 Definition for singly-linked list.
*/
 
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode p = fake;

        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null) {
            sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            if(sum > 9){
                carry= 1;
                sum -= 10;
            }else{
                carry = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
        }
        if(carry > 0) { 
            p.next = new ListNode(carry);
        }
        return fake.next;
    }


        
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        

        Solution s = new Solution();
        ListNode sum = s.addTwoNumbers(l1, l2);
        System.out.println(sum.val);
        sum = sum.next;
        System.out.println(sum.val);
        sum = sum.next;
        System.out.println(sum.val);
    }
}