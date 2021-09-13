class Solution {
    
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(new ArrayList<Integer>(), target, candidates,0);
        return resList;
    }
   
    private void backTrack(List<Integer> list, int target, int[] candidates, int start){
        
        if(target < 0){
            return;
        }
        
        if(target == 0){
            resList.add(new ArrayList(list));
        }
        
        for(int i = start; i< candidates.length; i++ ){
            list.add(candidates[i]);
            backTrack(list, target - candidates[i], candidates,i);
            list.remove(list.size()-1);
        }
        
    }
}
