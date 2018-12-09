package medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode pre = result;
        boolean isLess = false;
        while(l1 != null || l2 != null || isLess)
        {
            ListNode cur = OperAdd(l1,l2,isLess);
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
            isLess = (cur.val>=10);
            cur.val = isLess?cur.val-10:cur.val;
            pre.next = cur;
            pre = pre.next;
        }
        return result.next;
    }

    public static ListNode OperAdd(ListNode l1,ListNode l2,boolean isLess){
        ListNode result = new ListNode(0);
        if(l1 == null && l2 == null && isLess){
            result.val = 1;
        }else if(l1 == null){
            result.val = isLess ? l2.val+1:l2.val;
        }else if(l2 == null){
            result.val = isLess ? l1.val+1:l1.val;
        }else
        {
            result.val = isLess ? l1.val+l2.val+1:l1.val+l2.val;
        }
        return result;
    }

    public static void main(String[] args)
    {
        ListNode num1 = new ListNode(2);
        ListNode num2 = new ListNode(4);
        ListNode num3 = new ListNode(3);
        num1.next = num2;
        num2.next = num3;
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        ListNode list = addTwoNumbers(num1,n1);
        System.out.print(list.val);
        while(list.next != null){
            list = list.next;
            System.out.print(list.val);
        }
    }
}
