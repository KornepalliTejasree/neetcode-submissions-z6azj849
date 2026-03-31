class Solution {
    public int reverseBits(int n) {
        
        String s=Integer.toBinaryString(n);
       String s1=String.format("%32s",s).replace(' ','0');
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        s=sb.toString();
        System.out.print(s);
        long  num=Long.parseLong(s,2);
        return (int)num;
    }
}
