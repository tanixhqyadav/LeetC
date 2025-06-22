class Solution {
    public String[] divideString(String s, int k, char fill) {
        String []ar=new String[(int)Math.ceil((double)s.length()/k)];
        if(s.length()%k!=0){
            int h=(int)Math.ceil((double)s.length()/k);
            int rem=(h*k)-s.length();
            while(rem!=0){
                s+=fill;
                rem--;
            }
            // k=h;
        }
        for(int i=0;i<ar.length;i++){
            int st=i*k;
            int en=Math.min(st+k,s.length());
            ar[i]=s.substring(st,en);
        }
        return ar;
    }
}