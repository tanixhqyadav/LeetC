public class Solution {
    public int[] PlusOne(int[] dig) {
        // string ans="";
        // for(int i=0;i<dig.Length;i++){
        //     ans+=dig[i];
        // }
        // Console.WriteLine(ans);
        // long s=0;
        // for(int i=0;i<ans.Length;i++){
        //     s=s*10+(ans[i]-'0');
        // }
        // Console.WriteLine(s);
        // s+=1;
        // string h="";
        // h+=s;
        // int[] yu=new int[h.Length];
        // for(int i=0;i<h.Length;i++){
        //     yu[i]=(h[i]-'0');
        // }
        // Console.WriteLine(s);
        // return yu;
        for(int i=dig.Length-1;i>=0;i--){
            if(dig[i]<9){
                dig[i]++;
                return dig;
            }
            dig[i]=0;
        }
        dig=new int[dig.Length+1];
        dig[0]=1;
        return dig;
    }
}