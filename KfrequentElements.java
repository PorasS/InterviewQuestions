class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],0);
                }
                 map.put(nums[i], map.get(nums[i])+1);
            }
        
//             PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
//             for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//                 maxHeap.add(entry);
//             }
        
            //sort the map in descending order based on values
            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
            Collections.sort(entryList, (o1,o2)->o2.getValue().compareTo(o1.getValue()));
        
            int [] res = new int[k];
        
//             for(int j = 0; j<k;j++){
//                 res[j] = maxHeap.poll().getKey();                
//             }
            int j = 0;
    
            for(Map.Entry<Integer,Integer> entry: entryList){
                
                if(k>j){
                    res[j] = entry.getKey();
                    j++;
                }else{
                    break;
                }
                
            }
    
            return res;
    }
}
