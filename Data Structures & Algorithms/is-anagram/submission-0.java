class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
         for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
             mapS.put(c, mapS.getOrDefault(c, 0) + 1);

         }

         for(int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
         }

        return mapS.equals(mapT);


    }
}
