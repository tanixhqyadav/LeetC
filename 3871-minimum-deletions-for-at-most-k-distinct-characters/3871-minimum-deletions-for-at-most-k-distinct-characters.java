class Solution {
    public int minDeletion(String s, int k) {
       HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(Integer i:mp.values()){
            l.add(i);            
        }
        Collections.sort(l);
        System.out.println(l+" "+mp.size());
        int c=mp.size()-k;
        int ans=0;
        for(int i=0;i<c;i++){
            ans+=l.get(i);
        }
        return ans;
    }
}