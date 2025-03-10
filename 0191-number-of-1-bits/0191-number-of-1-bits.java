class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String bit = Integer.toBinaryString(n);
        for(char ch : bit.toCharArray()){
            if(ch == '1')
              count++;
        }
        return count;

    }
}