class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str: strs) {
            int[] count = new int[26];
            int charIndex;
            for(int i = 0; i < str.length(); i++){
                char chr = str.charAt(i);
                charIndex = chr - 'a';
                count[charIndex] += 1;

            }
            StringBuilder key = new StringBuilder();

            for(int i = 0; i < count.length; i++) {
                key.append(count[i]);
                key.append("#");
            }
            String finalKey = key.toString();
           if(map.containsKey(finalKey)){
                map.get(finalKey).add(str);
            } else {
                map.put(finalKey, new ArrayList<>());
                map.get(finalKey).add(str);
            }
        
    }
    return new ArrayList<>(map.values());
    }

}
