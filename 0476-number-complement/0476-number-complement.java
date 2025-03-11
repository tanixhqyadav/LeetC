class Solution {
    public int findComplement(int num) {
        int c=0;
        int s=0;
        while(num!=0){
            if(num%2==1){
                s+=0;
            }else{
                s+=(int)Math.pow(2,c);
            }
            c++;
            num/=2;
        }
        return s;
    }
}