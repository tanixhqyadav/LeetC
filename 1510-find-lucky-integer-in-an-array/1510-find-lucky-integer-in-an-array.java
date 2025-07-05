class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int min=Integer.MIN_VALUE;
        int x=0;
        for (Map.Entry<Integer,Integer> entry:mp.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(key>min && key==value){
                min=key;
                x=key;
            }
        }
        return x==0 ? -1 :x;
    }
}