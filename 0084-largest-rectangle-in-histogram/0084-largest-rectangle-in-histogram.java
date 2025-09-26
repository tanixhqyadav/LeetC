import java.util.*;
class Solution {
    public int largestRectangleArea(int[] he) {
        int n=he.length;
        ArrayList<Integer> nsr=nextsml(he);
        ArrayList<Integer> nsl=prevsml(he);
        System.out.println(nsr);
        System.out.println(nsl);
        int ans=0;
        for(int i=0;i<he.length;i++){
            ans=Math.max(he[i]*(nsr.get(i)-nsl.get(i)-1),ans);
        }
        return ans;
    }

    public ArrayList<Integer> nextsml(int[] ar) {
        Stack<Integer> st=new Stack<>();
        int n=ar.length;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && ar[i]<=ar[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=n;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(res[i]);
        }
        return l;
    }

    public ArrayList<Integer> prevsml(int[] ar) {
        Stack<Integer> st=new Stack<>();
        int n=ar.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && ar[i]<=ar[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(res[i]);
        }
        return l;
    }
}
