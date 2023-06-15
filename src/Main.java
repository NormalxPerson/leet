import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        System.out.println("hey");

    }
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