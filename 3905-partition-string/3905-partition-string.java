class Solution {
    public List<String> partitionString(String s) {
        List<String> al=new ArrayList<>();
        Set<String> seen=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            String temp=String.valueOf(s.charAt(i));
            if(!seen.contains(temp)){
                al.add(temp);
                seen.add(temp);
            } else {
                int j=i;
                while(true){
                    if (j+1==n)break;
                    temp=temp+s.charAt(j+1);
                    if (!seen.contains(temp)) {
                        al.add(temp);
                        seen.add(temp);
                        i=j+1; 
                        break;
                    }
                    j++;
                }
            }
        }
        return al;
    }
}