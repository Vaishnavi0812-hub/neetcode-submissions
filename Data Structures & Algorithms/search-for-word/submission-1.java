class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length, n=board[0].length;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(search(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][]board, String word, int i, int j, int k, boolean visited[][]){
        if(i<0 || i==board.length || j<0 || j==board[0].length){
            return false;
        }
        if(visited[i][j]==true){
            return false;
        }
        if(board[i][j]!=word.charAt(k)){
            return false;
        }
        if(k==word.length()-1){
            return true;
        }
        visited[i][j]=true;
        boolean found=search(board,word,i,j+1,k+1,visited) ||search(board,word,i,j-1,k+1,visited) ||search(board,word,i+1,j,k+1,visited) ||search(board,word,i-1,j,k+1,visited);
        visited[i][j]=false;
        return found;
    }
}
