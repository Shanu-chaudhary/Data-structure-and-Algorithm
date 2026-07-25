class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        convertToMaxHeap(nums);
        int ans = 0;
        for(int i=0; i<k; i++){
            ans = extractMax(nums, n);
            n--;
        }
        return ans;
    }
    private void convertToMaxHeap(int[] arr){
        int n = arr.length;
        for(int i= (n/2)-1; i>=0; i--){
            Heapify(arr, i, n);
        }
    }
    private void Heapify(int[] arr, int i, int n){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left<n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right<n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            Heapify(arr, largest, n);
        }
    }
     public int extractMax(int[] arr, int size) {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        
        int maxVal = arr[0];
        arr[0] = arr[size - 1]; // Replace root with last element
        size--;
        
        Heapify(arr, 0, size); // Bubble down to fix heap property
        return maxVal;
    }
}