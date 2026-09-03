class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> matchingPairs = new HashMap<>();
        matchingPairs.put(')', '(');
        matchingPairs.put(']', '[');
        matchingPairs.put('}', '{');

        for(char c : s.toCharArray()) {
            if(!matchingPairs.containsKey(c)) {
                stack.push(c);
            } else if(stack.isEmpty() && matchingPairs.containsKey(c)) {
                return false;
            }
            else if(!stack.isEmpty()) {
                char popped = stack.pop();
                if(popped != matchingPairs.get(c)) {
                    return false;

                }
            }
        }
        return stack.isEmpty();
        
    }
}
