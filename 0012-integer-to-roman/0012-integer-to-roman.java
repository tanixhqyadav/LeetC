class Solution{
    public String intToRoman(int num){
        String s=Integer.toString(num);
        String ans="";
        for(int i=0;i<s.length();i++){
            int baki=s.length()-i;
            if(baki==4){
                int ch=(s.charAt(i)-'0')*1000;
                while(ch>0){
                    ans+="M";
                    ch-=1000;
                }
            }
            if(baki==3){
                int d=s.charAt(i)-'0';
                if(d==9){
                    ans+="CM";
                } else if(d>=5){
                    ans+="D";
                    while(d-->5) ans+="C";
                } else if(d==4){
                    ans+="CD";
                } else {
                    while(d-->0) ans+="C";
                }
            }
            if(baki==2){
                int d=s.charAt(i)-'0';
                if(d==9){
                    ans+="XC";
                } else if(d>=5){
                    ans+="L";
                    while(d-->5) ans+="X";
                } else if(d==4){
                    ans+="XL";
                } else {
                    while(d-->0) ans+="X";
                }
            }
            if(baki==1){
                int d=s.charAt(i)-'0';
                if(d==9){
                    ans+="IX";
                } else if(d>=5){
                    ans+="V";
                    while(d-->5) ans+="I";
                } else if(d==4){
                    ans+="IV";
                } else {
                    while(d-->0) ans+="I";
                }
            }
        }
        return ans;
    }
}
