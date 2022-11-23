class Solution {
    public String reverseVowels(String s) {
        String[] chars = s.split("");
       int l=0;
       int r=chars.length-1;
       Map<String,String> map=new HashMap<>(); 
       map.put("a","");
       map.put("e","");
       map.put("i","");
       map.put("o","");
       map.put("u","");
       map.put("A","");
       map.put("E","");
       map.put("I","");
       map.put("O","");
       map.put("U","");
       while(l<r)
       {
            if(map.containsKey(chars[l]) && map.containsKey(chars[r]))
            {
                 String temp=chars[l];
                 chars[l]=chars[r];
                 chars[r]=temp;
                 l++;
                 r--;
               }
            else if(!map.containsKey(chars[l]))
            {
                l++;
            } 
           else if(!map.containsKey(chars[r]))
           {
                r--;
            }
       }
       return String.join("",chars);
    }
}
