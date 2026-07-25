class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num = n;
        while(num > 0){
            arr.add(num%10);
            num/=10;
        }
        Collections.sort(arr);
        return  arr.get(arr.size()-1)* arr.get(arr.size()-2);
    }
}