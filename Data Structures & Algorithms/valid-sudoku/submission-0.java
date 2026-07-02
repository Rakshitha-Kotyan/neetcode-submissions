class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> st=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];

                if(num!='.'){
                    if(!st.add(num+" "+"in the row"+i) || !st.add(num+" "+"in the columm"+j) || !st.add(num+" "+"in the box"+i/3+" "+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}
