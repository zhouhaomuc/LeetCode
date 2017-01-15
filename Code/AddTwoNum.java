import java.util.HashMap;

public class AddTwoNum {
	public static void main(String args[]){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(5);
		l1.next = n1;
		l1.next.next = n2;
		l2.next = n1;
		l2.next.next = n3;
		
		
		ListNode res = addTwoNumbers(n3,n3);
		while(res!=null){
			System.out.println(res.val);
			res = res.next;
		}
//		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	
	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int high = 0;
        int re = 0;
        ListNode res = new ListNode(0);
        ListNode flag = res;
        ListNode newNode;
        while((l1 != null) || (l2 != null) || (high !=0)){
            newNode = new ListNode(0);
            int raw = ((l1 == null)?0:l1.val) + ((l2 == null)?0:l2.val) + high;
            high = raw/10;
            re = raw%10;
            
            newNode.val = re;
            flag.next = newNode;
            flag = flag.next;
            System.out.println("high:"+high);
            System.out.println("re:"+re);
            System.out.println("nodevalue:"+newNode.val);
            l1 = (l1 ==null)?null:l1.next;
            l2 = (l2 ==null)?null:l2.next;
        }
        return res.next;
    }
}

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) { 
		val = x; 
	}
}
