class Solution {
    public int numWaterBottles(int nb, int ne) {
        return nb+op(nb,ne);
    }
    public static int op(int nb, int ne){
        if(nb<ne){
            return 0;
        }
        int x=nb/ne;
        return x+op(x+nb%ne,ne);
    }
}