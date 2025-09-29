public class Solution {
    public int MaxFreqSum(string s) {
        Dictionary<char, int> mp1 = new Dictionary<char, int>();
        Dictionary<char, int> mp2 = new Dictionary<char, int>();

        for(int i=0; i<s.Length; i++){
            if(op(s[i])){
                if (!mp1.ContainsKey(s[i]))
                    mp1[s[i]] = 0;
                mp1[s[i]]++;
            }
        }

        for(int i=0; i<s.Length; i++){
            if(!op(s[i])){
                if (!mp2.ContainsKey(s[i]))
                    mp2[s[i]] = 0;
                mp2[s[i]]++;
            }
        }

        int min1=0;
        int min2=0;

        foreach(int v in mp1.Values)   
            min1 = Math.Max(min1, v);

        foreach(int v in mp2.Values)   
            min2 = Math.Max(min2, v);

        return min1+min2;
    }

    public static bool op(char k){
        return k=='a' || k=='e' || k=='i' || k=='o' || k=='u';
    }
}
