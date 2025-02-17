/*Sort a linked list using insertion sort.

Subscribe to see which companies asked this question*/

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
     
public class Main {
	public static void main(String[] args) {
		int[] input = {-470,-346,602,625,819,861,439,722,706,800,894,855,-385,597,-101,-84,558,-16,-236,284,349,24,-268,100,-96,-432,514,10,152,502,-29,-475,-436,571,278,632,959,397,-322,-409,712,125,-181,779,361,514,882,139,54,314,272,-42,787,329,731,312,-333,-46,-152,798,-362,819,952,791,251,-232,977,-183,-140,-229,-256,-203,-230,170,-153,-360,938,-123,-83,447,898,710,-101,64,830,-403,217,-320,531,-471,727,-408,-368,218,842,891,-205,-37,-428,-93,374,330,-189,-445,814,240,290,254,-131,-344,895,36,-240,497,378,67,927,115,193,-256,-497,-82,406,637,-417,-452,518,-205,600,26,-373,-489,476,-287,-100,-361,783,101,147,-233,703,613,931,572,21,498,379,-168,-350,166,139,-62,-285,313,901,-432,858,172,-39,-354,117,-278,367,224,455,-198,559,403,2,690,-321,831,820,-146,424,-7,618,90,-377,70,705,770,-96,953,210,331,220,-275,146,949,-345,193,38,154,915,-241,-402,-128,-88,496,-234,811,690,960,-334,665,-405,-475,579,-134,515,-185,395,304,318,-246,-386,541,191,59,-138,-161,-317,-207,-134,202,925,-140,416,57,665,568,189,148,228,747,565,-124,510,-282,-41,400,790,783,-79,453,415,-334,784,376,-203,831,-311,460,54,583,688,330,267,14,-27,752,-344,-100,-373,545,937,944,465,-289,193,735,-170,403,-153,-482,41,335,301,-350,845,634,-213,-486,-406,-10,71,986,-107,418,211,-17,951,98,934,701,-362,-153,843,819,78,576,158,-477,-71,454,200,570,420,-176,716,488,-269,617,413,357,681,178,796,951,983,710,844,661,464,-386,942,-483,-240,955,-203,966,292,39,-270,924,527,984,810,-425,-479,404,724,-83,162,520,-334,-348,189,949,-99,-443,136,-475,216,415,80,530,127,635,831,794,778,335,-101,577,853,-118,976,-354,537,9,575,-430,685,51,707,-26,584,-482,968,-194,-91,832,-84,-330,188,171,712,66,-263,-376,741,55,410,990,688,-437,-430,-121,-207,426,186,552,528,136,-470,-222,436,465,994,-266,-404,353,117,454,-95,826,254,917,426,-29,63,-348,303,869,-167,270,-426,816,971,-282,83,809,906,93,-378,114,410,-354,104,-188,381,933,919,391,-99,570,274,717,11,637,-185,914,918,277,397,561,-262,-451,752,55,-68,134,401,257,591,489,465,-115,-444,-177,8,-204,519,517,-305,292,207,943,453,392,-339,400,57,-445,-11,542,25,-256,510,0,543,-422,696,732,307,443,-297,321};
		
		//ListNode head = new ListNode(-1);
		ListNode head = new ListNode(input[0]);
		head.next = null;
		
		for(int i = 1; i < input.length; i++) {
			//System.out.println(input[i]);
			insert(head, input[i]);
		}
		
		ListNode temp = head;
		while(temp != null) {
			//System.out.println(temp.val);
			temp = temp.next;
		}
		
		ListNode res = insertionSortList(head);
		temp = res;
		while(temp != null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}

	public static void insert(ListNode head, int val) {
/*		if(head == null) {
			head = new ListNode(val);
			head.next = null;
		}*/
		//else {
			ListNode temp = head;
			
			while(temp.next != null) temp = temp.next;
			
			ListNode newNode = new ListNode(val);
			newNode.next = null;
			temp.next = newNode;
		//}
	}
	
    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        newHead.next = head;
        
        ListNode p = newHead;
        ListNode q = head;
       
        while(q.next != null) {
            ListNode prev = q;
            ListNode curr = q.next;
            ListNode next = q.next.next;
            
            if(curr.val >= prev.val) {
            	q = q.next;
            }
            else {
	            prev.next = next;
	            
	            while(p.next.val < curr.val) {
	                //System.out.println(p.val);            
	                p = p.next;
	            }
	            
	            ListNode pnext = p.next;
	            p.next = curr;
	            curr.next = pnext;
	            
	            p = newHead;
            }
            
            //if(q.next == null) break;
        }
        
        return newHead.next;
    }	
}
