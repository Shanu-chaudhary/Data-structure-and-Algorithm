class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i==0){
                arr1.add(nums[i]);
            }else if(i==1){
                arr2.add(nums[i]);
            }else {
                int last1 = arr1.get(arr1.size()-1);
                int last2 = arr2.get(arr2.size()-1);
                if(last1 > last2){
                    arr1.add(nums[i]);
                }else {
                    arr2.add(nums[i]);
                }
            }
        }
        arr1.addAll(arr2);
        // Convert ArrayList<Integer> to int[]
        int[] array = arr1.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
        return array;
    }
}