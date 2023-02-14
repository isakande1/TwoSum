import java.util.*;

class Solution {
	
    public List<List<String>> groupAnagrams(String[] arr) {
         List<List<String>> result = new ArrayList<>();
        if (arr.length ==0){
return result;
        } 
       HashMap<String,List<String>> hash = new HashMap<>();
		for(String s: arr) {
			char [] count = new char[26];
			for(char a : s.toCharArray()) {
				count[a -'a']++;
				}
			String key = new String(count);
			hash.computeIfAbsent(key, k -> new ArrayList<>());
			hash.get(key).add(s);
		}
		
		result.addAll(hash.values());
		return result;
        
    }
}