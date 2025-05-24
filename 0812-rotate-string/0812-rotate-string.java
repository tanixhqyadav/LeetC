class Solution {
    public boolean rotateString(String s, String g) {
        for(int i=0;i<s.length();i++){
            String l=rotate(s,i);
            // System.out.println(l);
            if(l.equals(g)){
                return true;
            }
        }
        return false;
    }
    public static String rotate(String s, int k){
        int n=s.length();
        String h=s.substring(0,n-k);
        String op=s.substring(n-k);
        reverse(op);
        return op+h;

    }
    public static void reverse(String s){
    char[] arr = s.toCharArray();  
    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    String reversed = new String(arr);
    }
}