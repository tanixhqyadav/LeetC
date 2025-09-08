class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ll=new ArrayList<>();
        HashMap<HashMap<Character,Integer> , List<String> > mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            HashMap<Character, Integer> xp=op(s);
            if(mp.containsKey(xp)){
                mp.get(xp).add(s);
            }else{
                mp.put(xp, new ArrayList<>(Arrays.asList(s)));
            }
        }
        for(HashMap<Character,Integer> vl:mp.keySet()){
            ll.add(mp.get(vl));
        }
        System.out.println(ll);
        return ll;
    }
    public static HashMap<Character,Integer> op(String s){
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        return mp;
    }
}