class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9]; 
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int row = 0;row<9;row++){
            for(int col=0;col<9;col++){
                char dgt=board[row][col];
                if(dgt!='.'){
                    int box = (row/3)*3 + (col/3);
                    if(rows[row].contains(dgt) || cols[col].contains(dgt) || boxes[box].contains(dgt)){
                        return false;
                    }
                    rows[row].add(dgt);
                    cols[col].add(dgt);
                    boxes[box].add(dgt);
                }
            }
        }
        return true;
    }
}