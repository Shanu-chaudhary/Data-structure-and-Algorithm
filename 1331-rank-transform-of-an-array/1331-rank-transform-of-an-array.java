class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return new int[]{};
        }
        int[] copy = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(copy[0], 1);
        for(int i=1; i<copy.length; i++){
            if(copy[i] != copy[i-1]){
                mpp.put(copy[i], mpp.size()+1);
            }
        }
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
             int rank = mpp.get(arr[i]);
             ans[i] = rank;
        }
        return ans;
    }
}