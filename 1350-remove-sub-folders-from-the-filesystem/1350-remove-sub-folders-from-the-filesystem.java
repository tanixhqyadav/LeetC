class Solution {
    public List<String> removeSubfolders(String[] fl) {
        Arrays.sort(fl);                      
        List<String> res=new ArrayList<>();
        String pr="";
        for (String f:fl) {
            if(res.isEmpty() || !f.startsWith(pr)) {
                res.add(f);                   
                pr=f+"/";           
            }
        }
        return res;
    }
}
