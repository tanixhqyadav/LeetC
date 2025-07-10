class Solution {
    public int maxEnvelopes(int[][] ev) {
        Arrays.sort(ev,(a,b)-> { 
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return  a[0]-b[0];
        });
        for(int i=0;i<ev.length;i++){
            System.out.println(ev[i][0]+" "+ev[i][1]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<ev.length;i++){
            l.add(ev[i][1]);
        }

        return Lis(l);
    }
    public static int Lis(List<Integer> l){
        int dp[]=new int[l.size()];
        dp[0]=l.get(0);
        int le=1;
        for(int i=1;i<l.size();i++){
            if(l.get(i)>dp[le-1]){
                dp[le]=l.get(i);
                le++;
            }else{
                int idx=binar(dp,0,le-1,l.get(i));
                dp[idx]=l.get(i);
            }
        }
        return le;
    }
    public static int binar(int dp[],int i,int j,int t){
        int a=i;
        int b=j;
        int ans=0;
        while(a<=b){
            int mid=(a+b)/2;
            if(dp[mid]>=t){
                ans=mid;
                                b=mid-1;
            }else{
                a=mid+1;
            }
        }
        return ans;
    }
}