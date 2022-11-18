class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<3 || numRows==1)
        {
            return s;
        }
        int n = s.length(), arr[] = new int[n], i = 0,c = 1;
        boolean flag = true;
        while(i < n){
            if(i< n && c == 1){
                flag = true;
            }
            if(i< n && c == numRows){
                flag = false;
            }
            if(i< n && !flag){
                arr[i] = c;
                c--;
                i++;
            }
            else if(i< n && flag){
                arr[i] = c;
                c++;
                i++;
            }
        }
        String[] str = new String[numRows];
        Arrays.fill(str,"");
        for(int j = 0; j < n; j++)
            str[arr[j] - 1] += s.charAt(j);
        String res = "";
        for(int j = 0; j < numRows; j++)
            res += str[j];
        return res;
    }
}
