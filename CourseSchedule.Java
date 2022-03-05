class Solution {
    
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
           
        for(int i = 0; i<prerequisites.length; i++){
            for(int j = 0; j<numCourses; j++){
                
                // avoid cycle like 1->1->1
                if(prerequisites[i][0] == j && prerequisites[i][1] ==j){
                    return false;
                }
                
                if(prerequisites[i][0] == j){
                    if(map.containsKey(j)){
                        List<Integer> l = map.get(j);
                        l.add(prerequisites[i][1]);
                        map.put(j,l);
                    }else{
                        List<Integer> newList = new ArrayList<>();
                        newList.add(prerequisites[i][1]);
                        map.put(j,newList);
                    }
                }
            }
        }
        
        System.out.println(map.toString());
        int course = 0;
 
        for(int i = 0; i<numCourses; i++){
            //run DFS for each course
            if(!dfs(i)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(int course){
        List<Integer> preq = map.get(course);
        if(visited.contains(course)){
            return false;
        }
       
        if(preq == null || preq.isEmpty()){
            return true;
        }
        
        visited.add(course);
        
        // //run loop for each preq courses
        for(int i = 0; i<preq.size();i++){
            Integer cour = preq.get(i);
            if(dfs(cour)){
                preq.remove(cour);
                // remove a course from the visited list,
                // as we already finished visiting it
                visited.remove(course);
            }else{
                return false;
            }
        }
        
        return true;
    }

}
