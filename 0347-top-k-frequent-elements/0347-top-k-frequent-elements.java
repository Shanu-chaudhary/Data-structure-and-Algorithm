// class Pair {
//     int num;
//     int freq;
//     Pair(int num, int freq){
//         this.num = num;
//         this.freq = freq;
//     }
// }
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            arr.add(new ArrayList<>());
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int idx = entry.getValue();
            arr.get(idx).add(entry.getKey());
        }
        ArrayList<Integer> fans = new ArrayList<>();
        for(int i=arr.size()-1; i>=0; i--){
            if(arr.get(i).size() == 0){
                continue;
            }
            int l = arr.get(i).size();
            while(l > 0 && k > 0){
                fans.add(arr.get(i).getLast());
                arr.get(i).remove(l-1);
                l--;
                k--;
            }
        }
        int[] ans = new int[fans.size()];
        int l = ans.length;
        for(int j=0; j<l; j++){
            ans[j] = fans.get(j);
        }
        return ans;
    }
}