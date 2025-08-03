class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int s1=num1.indexOf("+");
        int s2=num2.indexOf("+");
        String ange=num1.substring(0,s1);
        String piche=num1.substring(s1+1,num1.length()-1);
        String ange1=num2.substring(0,s2);
        String piche1=num2.substring(s2+1,num2.length()-1);
        // System.out.println(piche1+" "+piche);
        int po=Integer.parseInt(ange)*Integer.parseInt(ange1);
        int op=(Integer.parseInt(ange)*Integer.parseInt(piche1));
        int po1=Integer.parseInt(piche)*Integer.parseInt(ange1);
        int op1=(Integer.parseInt(piche)*Integer.parseInt(piche1));
        int real=po-op1;                 
        int imag=op+po1;               
        return real+"+"+imag+"i";
    }
}