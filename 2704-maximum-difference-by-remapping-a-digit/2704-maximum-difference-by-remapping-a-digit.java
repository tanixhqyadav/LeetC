class Solution {
    public int minMaxDifference(int num) {
        return max(num)-min(num);
        // return max(num);
        // return min(num);
    }
    public int max(int num){
        int op=num;
        String s=""+num;
        char io[]=s.toCharArray();
        char x='\0';
        for(int i=0;i<io.length;i++){
            if(io[i]!='9'){
                x=io[i];
                break;
            }
        }
        for(int i=0;i<io.length;i++){
            if(io[i]==x){
                io[i]='9';
            }
        }
        return Integer.parseInt(new String(io));
    }
    public int min(int num){
        int op=num;
        String s=""+num;
        char io[]=s.toCharArray();
        char x=io[0];
        for(int i=0;i<io.length;i++){
            if(io[i]==x){
                io[i]='0';
            }
        }
        return Integer.parseInt(new String(io));
    }
}