class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<String> operators = Set.of("+", "-", "*", "/");
        for(String token: tokens) {
            if(operators.contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = computeValue(a,b,token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }

    private int computeValue(int a, int b, String operator) {
    switch (operator) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        default: throw new IllegalArgumentException("Unknown operator: " + operator);
    }
}
}
