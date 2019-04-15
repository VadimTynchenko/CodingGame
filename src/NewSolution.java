import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class NewSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String[] res = new String[H];

        for (int i = 0; i < res.length; i++) {
            res[i] = "";
        }

        char[] t = T.toUpperCase().toCharArray();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            ROW = ROW.replace(' ', '.');

            for(int k = 0; k < H; k++) {
                for (int j = 0; j < t.length; j++) {
                    res[k] += showRow(ROW, t[j], L);
                }
                res[k] += "\n";
            }
        }

        T = res[0];
        System.out.println(T);
    }

    private static String showRow(String ROW, char ch, int width) {
        String[] lineOfLetter = new String[27];

        int m = 0;

        for (int i = 0; i < lineOfLetter.length; i++) {
            lineOfLetter[i] = ROW.substring(m, m + width);
            m += width;
        }

        for (int i = 0; i < lineOfLetter.length; i++) {
            if (ch - 65 == i) return lineOfLetter[i];
        }
        if (ch == ' ') return "  ";
        return lineOfLetter[26];
    }
}