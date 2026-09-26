class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

         for(int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            count[index]--;
        }

        for(int k = 0; k < count.length; k++) {
            if(count[k] != 0) {
                return false;
            }

        }
              return true;
    }
}
