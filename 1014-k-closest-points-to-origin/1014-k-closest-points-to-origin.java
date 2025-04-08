class Reg{
    double are;
    int[] cor;
    Reg(double are,int[] cor){
        this.are=are;
        this.cor=cor;
    }
}
class Solution{
    public int[][] kClosest(int[][] ar,int k){
        PriorityQueue<Reg> q=new PriorityQueue<>( (a,b) -> Double.compare(b.are , a.are));
        for(int i=0;i<ar.length;i++){
            double xy=area(ar[i][0],ar[i][1]);
            q.add(new Reg(xy,new int[]{ar[i][0],ar[i][1]}));
            if(q.size()>k){
                q.poll();
            }
        }
        int[][] res=new int[k][2];
        int i=0;
        while(!q.isEmpty()){
            res[i++]=q.poll().cor;
        }
        return res;
    }

    public static double area(int x,int y){
        return Math.sqrt(x*x+y*y);
    }
}
