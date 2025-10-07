class Solution {
    public String convert(String s, int n) {
        if(n==1 || s.length()<=n ){
            return s;
        }
        String ar[]=new String[n];
        Arrays.fill(ar,"");
        int i=0;
        int mo[]={1,-1};
        int t=0;
        int cr=0;
        while(i<s.length()){
            ar[cr]+=s.charAt(i);
            i++;
            if(cr==0){
                t=0;
            }
            else if(cr==n-1){
                t=1;
            }
            cr+=mo[t];
        }
        String an="";
        for(String x:ar){
            an+=x;
        }
        return an;
    }
}