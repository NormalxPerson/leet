import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        ListNode node5 = new ListNode(9);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node5a = new ListNode(2);
        ListNode node4a = new ListNode(6, node5a);
        ListNode node3a = new ListNode(4, node4a);
        ListNode node2a = new ListNode(4, node3a);
        ListNode node1a = new ListNode(2, node2a);

        ListNode answer = calculations(node1, node1a);
        System.out.println(answer.val);
        System.out.println(answer.next.val);
    }


    public static ListNode calculations(ListNode l1, ListNode l2) {
       ListNode newL1 = reverseList(l1, null);
       ListNode newL2 = reverseList(l2, null);
       long answer = nodeToNumber(newL1) + nodeToNumber(newL2);
       ArrayList<ListNode> newList = numberToListNode(answer);
       ListNode newHead = reverseList(newList.get(0), null);
       return newHead;

    }

    public static ListNode reverseList(ListNode head, ListNode prev ) {
        if (head == null) { return prev; }
        ListNode next = head.next;
        head.next = prev;
        return reverseList(next, head);

    }
    public static long nodeToNumber(ListNode head) {
        String numbers = "";
        while (head != null) {
            numbers += Integer.toString(head.val);
            head = head.next;
        }
        long number = Long.parseLong(numbers);
        return number;
    }

    public static ArrayList<ListNode> numberToListNode(long number) {
        String num = Long.toString(number);
        ArrayList<ListNode> listOfNodes = new ArrayList<>();
        for (int i = 0; i < num.length(); i++){
            ListNode node = new ListNode(num.charAt(i)-'0');
            listOfNodes.add(node);
        }
        for (int i = 0; i < listOfNodes.size(); i++){
            if (i == listOfNodes.size()-1) {
                listOfNodes.get(i).next = null;
                break;
            }
            listOfNodes.get(i).next=listOfNodes.get(i+1);
        }
        return listOfNodes;
    }

//    public static ListNode numberToListNode(String numberString){
//
//    }




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