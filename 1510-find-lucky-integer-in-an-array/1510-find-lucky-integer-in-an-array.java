class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        int lucky = -1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i : map.keySet()){
            System.out.println(i);
            System.out.println(map.get(i));
            if(map.get(i) == i &&  i> lucky){
                lucky = i;
            }
        }
        return lucky;
    }
}