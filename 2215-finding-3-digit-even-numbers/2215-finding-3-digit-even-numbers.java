class Solution {
    public int[] findEvenNumbers(int[] dig) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < dig.length; i++) {
            mp.put(dig[i], mp.getOrDefault(dig[i], 0) + 1);
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            if (i % 2 == 0) {
                if (check(i, mp)) {
                    l.add(i);
                }
            }
        }

        Collections.sort(l);
        int[] ar = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            ar[i] = l.get(i);
        }

        return ar;
    }

    public static boolean check(int n, HashMap<Integer, Integer> mp) {
        HashMap<Integer, Integer> temp = new HashMap<>(mp); 

        while (n != 0) {
            int digit = n % 10;
            if (!temp.containsKey(digit) || temp.get(digit) == 0) {
                return false;
            }
            temp.put(digit, temp.get(digit) - 1);
            n /= 10;
        }

        return true;
    }
}

// class Solution {
//     public int[] findEvenNumbers(int[] dig) {
//         HashMap<Integer, Integer> mp=new HashMap<>();
//         for(int i=0;i<dig.length;i++){
//             mp.put(dig[i],mp.getOrDefault(dig[i],0)+1);
//         }
//         List<Integer> l=new ArrayList<>();
//         for(int i=100;i<=999;i++){
//             if(i%2==0){
//                 if(check(i,mp)){
//                     l.add(i);
//                 }
//             }
//         }
//         Collections.sort(l);
//         int ar[]=new int[l.size()];
//         for(int i=0;i<l.size();i++){
//             ar[i]=l.get(i);
//         }
//         return ar;
//     }
//     public static boolean check(int n,HashMap<Integer> mp){
//         int nx=n;
//         HashMap<Integer, Integer> mp1=new HashMap<>();
//         while(nx!=0){
//             int y=nx%10;
//             mp.put(y,mp.getOrDefault(y,0)+1);
//             nx/=10;
//         }
//         int c=0;
//         while(n!=0){
//             int x=n%10;
//             if(mp.contains(x)){
//                 if(mp.get(x)<=mp1.get(x)){
//                     c++;
//                 }
//             }
//             n=n/10;
//         }
//         return c==3;
//     }
// }