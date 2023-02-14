import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     		int[] result = new int [k];
		HashMap<Integer,Integer> store = new HashMap();
		HashMap<Integer,List<Integer>> store2 = new HashMap<>();
		for(Integer i : nums) {
		   store.computeIfAbsent(i, c->0);
		   store.compute(i, (key,val)->val+1);
		   }
		for(Map.Entry<Integer,Integer> entry: store.entrySet()) {
			int key =entry.getKey();
			int value=entry.getValue();
			store2.computeIfAbsent(value, e -> new ArrayList<>());
			store2.get(value).add(key);
		}
		for(int d =0, i=0 ; d< k; d++) {
			int max = Collections.max(store2.keySet());
			
			for(int s: store2.get(max)) {
			result[i++]= s;
			}
			if(result[k-1] !=0){
				return result;
			}	
			store2.remove(max);
     }
			return result;   
    }
}