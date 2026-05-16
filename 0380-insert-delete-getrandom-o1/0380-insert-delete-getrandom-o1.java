class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        // set.add(val);
        if(set.contains(val)){
            return false;
        }else {
            set.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }else {
            return false;
        }
    }
    
    public int getRandom() {
        int size = set.size();
        int itemIdx = new Random().nextInt(size);
        int i = 0;
        for(int item : set) {
            if (i == itemIdx) return item;
            i++;
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */