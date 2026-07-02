class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){    
            if(adj.containsKey(prerequisites[i][1])){
                adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }else{
                adj.put(prerequisites[i][1],new ArrayList<>());
                adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        int count=0;
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int course = q.poll();
            count++;
            for(int x:adj.getOrDefault(course, new ArrayList<>())){
                indegree[x]--;
                if(indegree[x]==0){
                    q.add(x);
                }
            }        
        }
        return count==numCourses;
    }
}