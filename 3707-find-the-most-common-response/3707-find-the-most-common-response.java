class Solution {
    public String findCommonResponse(List<List<String>> res) {
        HashMap<String,Integer> mp=new HashMap<>();
        List<List<String>> ll=new ArrayList<>();
        for(int i=0;i<res.size();i++){
            Set<String> st=new HashSet<>();
            for(int j=0;j<res.get(i).size();j++){
                st.add(res.get(i).get(j));
            }
            List<String> l=new ArrayList<>(st);
            ll.add(l);
        }
        List<String> l=new ArrayList<>();
        for(int i=0;i<ll.size();i++){
            for(int j=0;j<ll.get(i).size();j++){
                l.add(ll.get(i).get(j));
            }
        }
        for(int i=0;i<l.size();i++){
            mp.put(l.get(i),mp.getOrDefault(l.get(i),0)+1);
        }
        Collections.sort(l, (a,b) ->{
            if(mp.get(a)==mp.get(b)){
                return String.valueOf(a).compareTo(String.valueOf(b));
            }
            return mp.get(b).compareTo(mp.get(a));
        });
        return l.get(0);
    }
}