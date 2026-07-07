class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(new String(arr), k -> new ArrayList<>());
            map.get(new String(arr)).add(word);

        }
        return new ArrayList<>(map.values());
    }
}