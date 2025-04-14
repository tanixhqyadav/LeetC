class Solution {
    public int countGoodTriplets(int[] ar, int a, int b, int c) {
        int l=0;
        for(int i=0;i<ar.length-2;i++){
            for(int j=i+1;j<ar.length;j++){
                for(int k=j+1;k<ar.length;k++){
                if(Math.abs(ar[i]-ar[j])<=a && Math.abs(ar[j]-ar[k])<=b && Math.abs(ar[i]-ar[k])<=c ){
                    l++;
                    }
                }
            }
        }
        return l;
    }
}