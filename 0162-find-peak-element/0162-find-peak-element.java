class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) { // it means we are searching in the dec. part of the array
                end = mid; // coz may be mid is the largest so we do end = mid
            } else {
                start = mid +1; 
            }
        }
        return start; // or end coz both are same
    }
}