class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<String> validPairs = Arrays.asList("()", "{}", "[]");
        boolean changed = true;

        while(changed) {
            changed = false;
            for(int i = 0; i <= sb.length() - 2; i++) {
                String currentPair = sb.substring(i, i+2);
                if(validPairs.contains(currentPair)) {
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    changed = true;
                    break;
                }
            }
        }
        return sb.isEmpty();
        
    }
}
