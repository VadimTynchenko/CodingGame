import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

// THIS SOLUTION DOESN'T WORK RIGHTLY
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(); // width
        int H = in.nextInt(); // height
        if (in.hasNextLine()) {
            in.nextLine();
        }

        Letter[] letters = new Letter[27]; // array of letters in abs

        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter();
        }

        String T = in.nextLine(); // input text

            for (int height = 0; height < H; height++) {
                String ROW = in.nextLine();

                int rowInOneLetter = 0;
                    for (int letter = 0; letter < 27; letter++) {
                        if (rowInOneLetter > ROW.length() - L) break;
                        letters[letter].putString(ROW.substring(rowInOneLetter, rowInOneLetter + L), height, (char) ('A' + letter)); // it's OK!!!
                        rowInOneLetter += L;
                }
            }

            T = T.toUpperCase();

            char[] answer = T.toCharArray();

        for (char c : answer) {
            for (Letter letter : letters) {
                if (c == (letter.ch)) letter.show();
            }
            System.out.println();
        }
    }
}

class Letter {

    private String[] line = new String[5];
    char ch;

    void putString(String row, int height, char ch) {
        line[height] = row;
        this.ch = ch;
    }

    void show() {
        for (String res :
                line) {
            System.out.println(res);
        }
    }

}
