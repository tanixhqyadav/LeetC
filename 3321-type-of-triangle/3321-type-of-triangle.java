class Solution {
    public String triangleType(int[] nums) {
        int i=nums[0];
        int j=nums[1];
        int k=nums[2];
        if(!none(i,j,k)) {
            return "none";
        }
        if(equi(i,j,k)) {
            return "equilateral";
        }
        if(iso(i,j,k)) {
            return "isosceles";
        }
        return "scalene";
    }

    public static boolean none(int a,int b,int c) {
        return a+b>c && a+c>b && b+c>a;
    }

    public static boolean equi(int a,int b,int c) {
        return a==b && b==c;
    }

    public static boolean iso(int a,int b,int c) {
        return (a==b || b==c || a==c) && !(a==b && b==c);
    }
}
