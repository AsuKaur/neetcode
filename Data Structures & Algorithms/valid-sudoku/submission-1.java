class Solution {
    public boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++){
          Set<Character> rowSeen=new HashSet<>();
          Set<Character> colSeen=new HashSet<>();
          Set<Character> sqSeen=new HashSet<>();
          for(int j=0;j<9;j++){
            char row=board[i][j];
            char col=board[j][i];
            if(row!='.'){
              if(rowSeen.contains(row)) return false;
              else rowSeen.add(row);
            }
            if(col!='.'){
              if(colSeen.contains(col)) return false;
              else colSeen.add(col);
            }
          }
          for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
              int row=(i/3)*3+r;
              int col=(i%3)*3+c;
              char ch=board[row][col];
              if(ch!='.'){
                if(sqSeen.contains(ch)) return false;
                else sqSeen.add(ch);
              }
            }
          }

        }
        return true;
    }
}
