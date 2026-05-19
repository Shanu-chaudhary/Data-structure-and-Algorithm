class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Store frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersection
        for (int num : nums2) {

            int count = map.getOrDefault(num, 0);

            if (count > 0) {
                list.add(num);

                if (count == 1) {
                    map.remove(num);
                } else {
                    map.put(num, count - 1);
                }
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}