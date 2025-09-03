class Solution {
    private static List<Integer> bs=new ArrayList<>();
    private  static int lx=Integer.MAX_VALUE;

    public int[] minDifference(int n, int k) {
      List<Integer> l=new ArrayList<>();
      for(int i=1;i<=n;i++){
        if(n%i==0){
            l.add(i);
        }
      } 
      System.out.println(l);
    List<Integer> ans=new ArrayList<>();
    dfs(l,n,k,ans,0,1,lx);
    int ui[]=new int [k];
    for(int i=0;i<k;i++){
        ui[i]=bs.get(i);
    }
    return ui;
    }
    public static void dfs(List<Integer> l,int n,int k,List<Integer> ans,int i, int p,int lx){
        if(p==n && k==0){
            int h=Collections.max(ans)-Collections.min(ans);
            if(h<lx){
                lx=h;
                bs=new ArrayList<>(ans);
            }
            return ;
        }
        if(k<0 || p>n){
            return ;
        }
        
        for(int st=i;st<l.size();st++){
            ans.add(l.get(st));
            dfs(l,n,k-1,ans,st,p*l.get(st),lx);
            ans.remove(ans.size()-1);
        }
    }
}