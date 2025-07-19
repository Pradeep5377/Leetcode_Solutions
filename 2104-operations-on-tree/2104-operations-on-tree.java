class LockingTree {

    static int[] parent; 
    static List<Integer>[] children;
    static int[] lockedBy; //Used for to track who locked whom.

    public LockingTree(int[] parent) {
        this.parent = parent;
        int n = parent.length;
        lockedBy = new int[n];
        Arrays.fill(lockedBy,-1);

        children = new ArrayList[n];
        for(int i=0;i<n;i++){
            children[i] = new ArrayList<>();
        }
        for(int i=1;i<n;i++){
            children[parent[i]].add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(lockedBy[num]==-1){
            lockedBy[num] = user;
            return true;
        }
        return false;
    }
    
    public boolean unlock(int num, int user) {
        if(lockedBy[num] == user){
            lockedBy[num] = -1;
            return true;
        }   
        return false;
    }
    
    public boolean upgrade(int num, int user) {

        if(lockedBy[num]!=-1) return false;
        if(!(checkLockedAncestors(num,parent))) return false;
        if(!(hasLockedDescendants(num))) return false;
        unlockAllDescendants(num);
        lockedBy[num] = user;
        return true;
    }

    private static boolean checkLockedAncestors(int num, int[] parent){

        int curr = parent[num];

        while(curr!=-1){
            if(lockedBy[curr] != -1) return false;
            curr = parent[curr];
        }
        return true;
    }

    private static boolean hasLockedDescendants(int num){
        for(int child : children[num]){
            if(lockedBy[child]!=-1 || hasLockedDescendants(child)) return true;
        }
        return false;
    }

    private static void unlockAllDescendants(int num){
        for(int child : children[num]){
            unlockAllDescendants(child);
        }
        if(lockedBy[num] !=-1){
            lockedBy[num] = -1;
        }
    }
}
