class Solution{
    public int earliestFinishTime(int[] lands,int[] landd,int[] waters,int[] waterd){
        return Math.min(lan(lands,landd,waters,waterd),wat(lands,landd,waters,waterd));
    }
    public static int lan(int[] lands,int[] landd,int[] waters,int[] waterd){
        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<lands.length){
            int dur=lands[i]+landd[i];
            int j=0;
            while(j<waters.length){
                int st=Math.max(waters[j],dur);
                min=Math.min(st+waterd[j],min);
                j++;
            }
            i++;
        }
        return min;
    }
    public static int wat(int[] lands,int[] landd,int[] waters,int[] waterd){
        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<waters.length){
            int dur=waters[i]+waterd[i];
            int j=0;
            while(j<lands.length){
                int st=Math.max(lands[j],dur);
                min=Math.min(st+landd[j],min);
                j++;
            }
            i++;
        }
        return min;
    }
}
