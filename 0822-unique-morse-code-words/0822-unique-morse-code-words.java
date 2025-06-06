class Solution {
    public int uniqueMorseRepresentations(String[] wor) {
        String alp[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // System.out.println(alp['z'-'a']);
        HashMap<String, Integer> mp=new HashMap<>();
        for(int i=0;i<wor.length;i++){
            String sp=wor[i];
            String k="";
            for(int j=0;j<sp.length();j++){
                k+=alp[sp.charAt(j)-'a'];
            }
            mp.put(k,mp.getOrDefault(k,0)+1);
        }
        System.out.println(mp);
        return mp.size();
    }
}