class Solution {
    public double average(int[] sa) {
        Arrays.sort(sa);
        if(sa.length==3){
            return (double) sa[1];
        }
        double s=0;
        double c=0;
        for(int i=1;i<sa.length-1;i++){
            s+=sa[i];
            c++;
        }
        return s/c;
    }
}