import java.util.List;

public class Main {


    public static void main(String[] args) {

        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode node5 = new ListNode(9);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(1, node2);

        head1 = reverseList(node1, null);
        int list1Num = stringToInt(nodeToString(head1));
    }


    public static ListNode reverseList(ListNode head, ListNode prev ) {
        if (head == null) { return prev; }
        ListNode next = head.next;
        head.next = prev;
        return reverseList(next, head);

    }
    public static String nodeToString(ListNode head) {
        String numbers = "";
        while (head != null) {
            numbers += Integer.toString(head.val);
            head = head.next;
        }
        return numbers;
    }

    public static int stringToInt(String numberString) {
        int num = Integer.parseInt(numberString);
        return num;
    }

    public static ListNode createListOfNodes(int[] intList) {
        ListNode
        for (int number : intList) {

        }
    }


//    public String getString(ListNode node){
//        ListNode head = new ListNode()node.val;
//        while (node.next != null) {
//            getString(node.next);
//        }
//
//
//    }



    //Definition for singly-linked list.0
    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

//    static class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        }
//    }
}

//    public static int romanToInt(String s) {
//        HashMap<Character, Integer> letterNumMap = new HashMap<Character, Integer>();
//
//        letterNumMap.put('M', 1000);
//        letterNumMap.put('D', 500);
//        letterNumMap.put('C', 100);
//        letterNumMap.put('L', 50);
//        letterNumMap.put('X', 10);
//        letterNumMap.put('V', 5);
//        letterNumMap.put('I', 1);
//
//        int total = 0;
//        int i=0;
//        while (i < s.length()) {
//            if (i+1 <= s.length()-1) {
//                if (letterNumMap.get(s.charAt(i)) < letterNumMap.get(s.charAt(i + 1))) {
//                    total += letterNumMap.get(s.charAt(i + 1)) - letterNumMap.get(s.charAt(i));
//                    i = i+2;
//                }
//                else {
//                    total += letterNumMap.get(s.charAt(i));
//                    i++;
//                }
//            }
//            else if (i<=s.length()-1) {
//                total += letterNumMap.get(s.charAt(i));
//                i++;
//            }
//        }
//
//        return total;
//
//    }
//}



        //Main start = new Main();
        //start.intialize();

        //ArrayList<String> strings = new ArrayList<>();
        //strings.add("hey");
        //System.out.println(strings.isEmpty());



//    public void  intialize() {
//        int[][] box = {
//                {0,0,0,0},
//                {0,0,0,0},
//                {0,0,0,0},
//                {0,0,0,0},
//
//        };
//        if (findSol(box, 0) == false) {
//            System.out.println("No Solution!");
//        }
//        printBox(box);
//    }
//
//    public boolean findSol (int[][] box, int col) {
//        if (col >= 4) return true;
//        for (int i = 0; i < 4; i++) {
//            if (placeQueenOrNot(box, i, col)==true) {
//                box[i][col]=1;
//                if (findSol(box,col+1) == true) return true;
//                box[i][col] = 0;
//            }
//        }
//        return false;
//    }
//
//    public boolean placeQueenOrNot(int[][]box, int row, int col) {
//        //col
//        for (int i=0; i <col; i++) {
//            if (box[row][i]==1) return false;
//        }
//        //left top diag
//        for (int i=row, j=col; i>=0 && j>=0; i--, j--) {
//            if (box[i][j]==1) return false;
//        }
//        //left bottom diag
//        for (int i=row,j=col; j>0 && i<4; i++, j--) {
//            if (box[row][i]==1) return false;
//        }
//        return true;
//    }
//
//    public void printBox(int[][] box) {
//        for (int i = 0; i < box.length; i++) {
//            for (int j = 0; j < box[0].length; j++) {
//                if (box[i][j] == 0) System.out.print("[]" );
//                else System.out.print("Q ");
//            }
//            System.out.println();
//
//        }
//    }
//}