package com.training;

import java.util.ArrayList;

public class EightQueens {
    private static final int BOARD_SIZE = 8;

    public void solve() {
        ArrayList<Integer[]> results = solve(0, new Integer[BOARD_SIZE], new ArrayList<>());
        System.out.println("The size of result set is " + results.size());
        for (Integer[] result : results) {
            convertToStringAndPrint(result);
        }
    }

    private void convertToStringAndPrint(Integer[] result) {
        StringBuilder sb = new StringBuilder();
        for (Integer r : result) {
            sb.append(r);
        }
        System.out.println(sb.toString());
    }

    private ArrayList<Integer[]> solve(int row, Integer[] columns, ArrayList<Integer[]> results) {
        if (row == BOARD_SIZE) {
            results.add(columns.clone());
        }
        else {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (isValid(columns, row, col)) {
                    columns[row] = col;
                    solve(row + 1, columns, results);
                }
            }
        }

        return results;
    }

    private boolean isValid(Integer[] columns, int row1, int column1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns[row2];

            if (column1 == column2) {
                return false;
            }

            int columnDistance = Math.abs(column2 - column1);
            int rowDistance = row1 - row2;
            if (columnDistance == rowDistance) {
                return false;
            }
        }
        return true;
    }
}
