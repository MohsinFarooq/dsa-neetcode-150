class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strs.size(); i++) {
            int strLength = strs.get(i).length();
           result.append(strLength).append('#').append(strs.get(i));

        }
        return result.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = str.indexOf('#', i);
            int strLength = Integer.parseInt(str.substring(i, j));
            String fragment = str.substring(j+1, j + 1 + strLength);
            result.add(fragment);
            i = j + 1 + strLength;

}
return result;

    }
}
