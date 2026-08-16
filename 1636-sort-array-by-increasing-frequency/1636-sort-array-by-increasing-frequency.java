class Solution {
    // class comp implements Comparator<nums>{

    // }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        int i = 0;
        for(int num : nums){
            arr[i++] = num;
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        Arrays.sort(arr, (a,b) -> {
            if(mp.get(a) == mp.get(b)){
                return b-a;
            }
            return mp.get(a)-mp.get(b);
        });
        for(int j=0; j<nums.length; j++){
            nums[j] = arr[j];
        }
        return nums;
    }
}