class Solution {
    public String reverseWords(String s) {
        int sp=0;
        s=s.trim();
        String[] arr=s.split("\s+");
        String s1="";
        for(int i=arr.length-1;i>=0;i--)
        {
            s1+=arr[i]+" ";
        }
        return s1.trim();
    }
}
