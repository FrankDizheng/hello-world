public class Solution {
    boolean impossible = false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++)
            graph.add(new ArrayList<Integer>());
        for(int[] edge: prerequisites)
            graph.get(edge[0]).add(edge[1]);
        Stack<Integer> stack = new Stack<>();
        int[] path = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            dfs(stack, path, i, graph);
            if(impossible)
                return new int[0];
        }
        int[] res = new int[numCourses];
        for(int i=numCourses - 1; i > -1; i--){
            res[i] = stack.pop();
        }
        return res;
        
    }
    public void dfs(Stack<Integer> stack, int[] path, int course, List<List<Integer>> graph){
        if(path[course] == 2 || impossible)
            return;
        if(path[course] == 1){
            impossible = true;
            return;
        }
        path[course] = 1;
        for(int nextCourse: graph.get(course)){
            dfs(stack, path, nextCourse, graph);
            if(impossible)
                return;
        }
        path[course] = 2;
        stack.push(course);
        return;
    }
}
