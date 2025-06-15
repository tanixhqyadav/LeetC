class Solution {
    public int maxDiff(int num) {
        if(num<=9){
            return 8;
        }
        System.out.println(max(num) +" "+ min(num));
        return max(num)-min(num);
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
        char y='\0';
        boolean fl=false;
        char tx='\0';
        int lp=0;
        if(io[0]==io[1]){
            y='1';
            tx=io[0];
            fl=true;
            lp=0;
        }
        else{
            y='0';
            tx=io[1];
            lp=1;
        }
        while(lp<io.length){
            if(fl && io[lp]==tx){
                io[lp]=y;
            }else if(io[lp]==tx){
                io[lp]=y;
            }
            lp++;
        }
        return Integer.parseInt(new String(io));
    }
}