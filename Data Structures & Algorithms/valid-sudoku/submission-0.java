class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows[] = new HashSet[9];
        Set<Character> cols[] = new HashSet[9];
        Set<Character> boxes[] = new HashSet[9];

            for (int i = 0; i < 9; i++) {
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
}
        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < cols.length; j++){
                char d = board[i][j];
                if(d == '.') continue;
                int b = (i/3)*3 + (j/3);
               if (rows[i].contains(d) || cols[j].contains(d) ||                    boxes[b].contains(d)) {
                    return false;
                }
                rows[i].add(d);
                cols[j].add(d);
                boxes[b].add(d);
            }
        }
        return true;
    }
}
