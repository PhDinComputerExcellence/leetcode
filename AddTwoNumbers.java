package leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        create(getNum(l1), getNum(l2));
        
    }
    
    public ListNode create(String x, String y){
        int xsize = x.length()-1;
        int ysize = y.length()-1;
        if (xsize > ysize){
            do {
                
            } while(xsize > -1);
        }
    }
    
    public String getNum(ListNode x){
        int power = 0;
        String num = "";
        ListNode current = x;
        do {
          if (power != 0){
              current = current.next;}

           num = addString(num, Integer.toString(current.val));
            power++;
        } while (current.next!=null);
        System.out.println(num);
        return num;
    }
    
    public String addString(String x, String y){
        String newest = y + x;
        return newest;
    }
}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	 }
