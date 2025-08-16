class Solution{
    public String originalDigits(String s){
        String st[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        String ans="";
        int order[]={0,2,4,6,8,1,3,5,7,9};
        for(int idx=0;idx<order.length;idx++){
            int i=order[idx];
            String lp=st[i];
            while(true){
                boolean pos=true;
                for(int j=0;j<lp.length();j++){
                    char ch=lp.charAt(j);
                    if(!mp.containsKey(ch)||mp.get(ch)<=0){
                        pos=false;
                        break;
                    }
                }
                if(!pos) break;
                for(int j=0;j<lp.length();j++){
                    char ch=lp.charAt(j);
                    mp.put(ch,mp.get(ch)-1);
                }
                ans+=i;
            }
        }
        char[] arr=ans.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}


// class Solution {
//     public String originalDigits(String s) {
//         String st[]={"zero","one", "two","three","four", "five","six", "seven", "eight","nine","ten"};
//         HashMap<Character, Integer> mp=new HashMap<>();
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
//         }
//         // System.out.println(mp);
//         for(int i=0;i<st.length;i++){
//             String lp=st[i];
//             // int c=0;
//             for(int j=0;j<lp.length();j++){
//                 if(mp.containsKey(lp.charAt(j))){
//                     // mp.put(lp.charAt(j),mp.getOrDefault(lp.charAt(j),0)-1);
//                     c++;
//                 }
//             }
//             // System.out.println(mp);
//             if(c==lp.length()){
//                 for(int x=0;x<lp.length();x++){
//                     mp.put(lp.charAt(x),mp.getOrDefault(lp.charAt(x),0)-1);
//                 }
//                 ans+=i;
//             }
//         }
//         // System.out.println(mp);
//         return ans;
//     }
// }