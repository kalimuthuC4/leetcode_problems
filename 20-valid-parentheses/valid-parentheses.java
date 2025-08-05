class Solution {
    public boolean check(char ch, char p) {
        if (ch == ')' && p == '(') {
            return true;
        } else if (ch == ']' && p == '[') {
            return true;
        } else if (ch == '}' && p == '{') {
            return true;
        } else {
            return false;
        }
        // return true;
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if(st.size()==0)
                return false;
                System.out.print(check(ch,st.peek()));
                if (!check(ch, st.peek()))
                    return false;
                // System.out.print(st);
                st.pop();
            }
        }
        System.out.print(st);

        return st.size() == 0;
    }
}