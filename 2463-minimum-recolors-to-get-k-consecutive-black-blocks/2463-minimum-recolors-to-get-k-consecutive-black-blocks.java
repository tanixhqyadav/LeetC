class Solution {
    public int minimumRecolors(String b, int k) {
        int c=0;
        int l=0;
        while(l<k){
            if(b.charAt(l)=='W'){
                c++;
            }
            l++;
        }
        int ans=c;
        int r=l;
        for(int i=l;i<b.length();i++){
            if(b.charAt(i-k)=='W'){
                c--;
            }
            if(b.charAt(i)=='W'){
                c++;
            }
            ans=Math.min(ans,c);
        }
        return ans;
    }
}