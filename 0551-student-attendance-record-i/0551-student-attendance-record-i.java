class Solution {
    public boolean checkRecord(String s) {
       if (s.contains("LLL")) {
            return false; 
        }
        if (s.indexOf('A') != s.lastIndexOf('A')) {
            return false; 
        }
        return true;
    }
}