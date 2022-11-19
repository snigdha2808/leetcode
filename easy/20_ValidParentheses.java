class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<Character>();
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c == '(' || c == '[' || c == '{')
            st.add(c);
        else{
            if(st.isEmpty())  return false;
            char top = st.pop();
            if(c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{')
                return false;
        }
    }
    return st.isEmpty();
    }
}
