class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int size = A.length;
        int[] f = new int[size+1];
        int[] Bf = new int[size];
        Arrays.fill(f, 0);
        // Arrays.fill(Bf, 0);
        
        for(int i=0; i<size; i++){
            f[A[i]] = f[A[i]]+1;
            f[B[i]] = f[B[i]]+1;
            int cnt=0;
            for(int j=0; j<f.length; j++){
                if(f[j] == 2){
                    cnt++;
                }
            }
            Bf[i] = cnt;
        }
        return Bf;
    }
}