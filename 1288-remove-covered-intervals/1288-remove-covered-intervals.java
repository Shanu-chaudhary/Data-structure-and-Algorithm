class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Sort by start ascending; for ties, end descending
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        int count = 0;
        int maxEnd = 0;

        for (int[] interval : intervals) {
            int end = interval[1];
            // If current end extends beyond maxEnd, it's not covered
            if (end > maxEnd) {
                count++;
                maxEnd = end;
            }
            // else: end <= maxEnd means this interval is covered by
            // some previous interval (since start >= previous starts
            // due to sorting), so we skip it
        }

        return count;
    }
}