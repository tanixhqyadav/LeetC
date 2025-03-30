class Solution {
    public boolean isValid(String sb) {
        int i = 0, j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int longestPalindrome(String s, String t) {
        int n = s.length(), m = t.length();
        int ans = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                String subS = s.substring(i, j);
                for (int k = 0; k <= m; k++) {
                    for (int l = k; l <= m; l++) {
                        String subT = t.substring(k, l);
                        String str = subS + subT;
                        if (isValid(str)) {
                            ans = Math.max(ans, str.length());
                        }
                    }
                }
            }
        }
        return ans;
    }
}