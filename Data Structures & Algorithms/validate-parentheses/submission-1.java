class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> opening = new HashMap<>();
        opening.put('(', ')');
        opening.put('{', '}');
        opening.put('[', ']');

        for (char c : s.toCharArray()) {
            if (opening.containsKey(c)) stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char a = stack.pop();
                if (c != opening.get(a)) return false;
            }
        }
        return stack.isEmpty();
    }
}
