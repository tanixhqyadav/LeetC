class Solution {
    public void setZeroes(int[][] mat) {
    int m=mat.length;
    int n=mat[0].length;
    Map<List<Integer>, Integer> mp = new HashMap<>();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[i][j] == 0){
                List<Integer> key = Arrays.asList(i, j);
                mp.put(key, mp.getOrDefault(key, 0) + 1);}
        }
    }
    for(List<Integer> l : mp.keySet()){
        int x=l.get(0);
        int y=l.get(1);
        hola(mat,x,y);
    }

    }
    public static void hola(int[][] ar, int i, int j) {
    int m = ar.length;
    int n = ar[0].length;

    int col=j;
    while (col >= 0) {
        if (ar[i][col] != 0) {
            ar[i][col] = 0;
        }
        col--;
    }

    col=j+1;
    while (col < n) {
        if (ar[i][col] != 0) {
            ar[i][col] = 0;
        }
        col++;
    }

    int row=i-1;
    while (row >= 0) {
        if (ar[row][j] != 0) {
            ar[row][j] = 0;
        }
        row--;
    }

    row=i+1;
    while (row < m) {
        if (ar[row][j] != 0) {
            ar[row][j] = 0;
        }
        row++;
    }
    }

}