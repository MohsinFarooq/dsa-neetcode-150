class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char d = board[i][j];
                if(d == '.') continue;
                int b = (i/3)*3 + (j/3);
                String rowKey = d + "r" + i;
                String colKey = d + "c" + j;
                String boxKey = d  + "b" + b;
               if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(boxKey)) {
                    return false;
                }
                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }
        return true;
    }
}
