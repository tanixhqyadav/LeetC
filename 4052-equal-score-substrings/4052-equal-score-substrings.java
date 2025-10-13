class Solution {
    public boolean scoreBalance(String sp) {
        int n=sp.length();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=(sp.charAt(i)-'a')+1;
        }
        int s=0;
        int pr[]=new int[n];
        for(int i=0;i<n;i++){
            s+=ar[i];
            pr[i]=s;
        }
        for(int i=0;i<n;i++){
            if(pr[i]==s-pr[i]){
                return true;
            }
        }
        return false;
    }
}