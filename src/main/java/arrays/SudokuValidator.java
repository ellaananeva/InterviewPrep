package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SudokuValidator {

    private static final int  LENGTH = 9;
    public boolean isSudokuValid(char[][] board) {
        HashSet<Integer>[] rows = new HashSet[LENGTH];
        HashSet<Integer>[] columns = new HashSet[LENGTH];
        HashSet<Integer>[] segments = new HashSet[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
             rows[i] = new HashSet<>(LENGTH);
             columns[i] = new HashSet<>(LENGTH);
             segments[i] = new HashSet<>(LENGTH);
        }
        boolean result = true;
        for (int i = 0; i< LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                char val = board[i][j];
                if (val != '.') {
                    int number = Character.getNumericValue(val);
                    if (rows[i].contains(number)) {
                        result = false;
                        break;
                    }
                    rows[i].add(number);
                    if (columns[j].contains(number)) {
                        result = false;
                        break;
                    }
                    columns[j].add(number);
                    int segmentNum = (i / 3 ) * 3 + j / 3;
                    if (segments[segmentNum].contains(number)){
                        result = false;
                        break;
                    }
                    segments[segmentNum].add(number);
                }
            }
        }
        return result;
    }


}
