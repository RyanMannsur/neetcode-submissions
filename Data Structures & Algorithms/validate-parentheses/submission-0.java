class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);

            switch(c) {
                case ')':
                    if (stack.empty() || !stack.pop().equals('(')) return false;
                    break;
                case '}':
                    if (stack.empty() || !stack.pop().equals('{')) return false;
                    break;
                case ']':
                    if (stack.empty() || !stack.pop().equals('[')) return false;
                    break;
                default: stack.push(c);
            }
        }

        if (stack.empty()) return true;

        return false;
    }
}
