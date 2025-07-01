class Solution {
    public int matchPlayersAndTrainers(int[] pl, int[] tr) {
        Arrays.sort(pl);
        Arrays.sort(tr);
        int i=0;
        int j=0;
        int c=0;
        while(i<pl.length && j<tr.length){
            if(pl[i]<=tr[j]){
                c++;
                i++;
            }
            j++;
        }
        return c;
    }
}