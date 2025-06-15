class Solution{
    public int maxDiff(int num){
        if(num<=9){
            return 8;
        }
        System.out.println(max(num)+" "+min(num));
        return max(num)-min(num);
    }
    public int max(int num){
        String s=String.valueOf(num);
        char[] io=s.toCharArray();
        char x='\0';
        for(int i=0;i<io.length;i++){
            if(io[i]!='9'){
                x=io[i];
                break;
            }
        }
        if(x!='\0'){
            for(int i=0;i<io.length;i++){
                if(io[i]==x){
                    io[i]='9';
                }
            }
        }
        return Integer.parseInt(new String(io));
    }
    public int min(int num){
        String s=String.valueOf(num);
        char[] io=s.toCharArray();
        char y='\0';
        boolean fl=false;
        char tx='\0';
        int lp=0;
        if(io[0]!='1'){
            y='1';
            tx=io[0];
        }else{
            for(int i=1;i<io.length;i++){
                if(io[i]!='0'&&io[i]!='1'){
                    y='0';
                    tx=io[i];
                    break;
                }
            }
        }
        for(lp=0;lp<io.length;lp++){
            if(io[lp]==tx){
                io[lp]=y;
            }
        }
        return Integer.parseInt(new String(io));
    }
}
