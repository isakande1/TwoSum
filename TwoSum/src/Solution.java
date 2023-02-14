import java.util.*;
public class Solution {
public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hashmap = new HashMap();
	int [] indices = new int[2];
	int  difference = 0;
	for(int i=0; i< nums.length; i++) {
		difference= (target - nums[i]);
		
	
			if(hashmap.containsKey(difference)) {
				indices[0] = hashmap.get(difference);
				indices[1]=i;
				return indices;
			}else {
				hashmap.put(nums[i],i);
			}
		
	
        
    }
	return indices;	    
	    }
	
}	
