package hashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		int[] arr  = {1,2,3,4,1,2,3,4,5}; 
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i=0; i<arr.length;i++) {
//			if(map.containsKey(arr[i]))
//				map.put(arr[i], map.get(arr[i])+1);
//			else
//				map.put(arr[i], 1);
			
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
			
		}
		for(Map.Entry<Integer,Integer> mp: map.entrySet()) {
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}

	}
	
}
