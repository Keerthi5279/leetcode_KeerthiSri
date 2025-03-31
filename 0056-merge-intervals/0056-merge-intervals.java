class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> al = new ArrayList<>();
        int[] cur = intervals[0];
        al.add(cur);

        for (int i = 1; i < n; i++) { 
            int curend = cur[1];
            int nextstart = intervals[i][0];
            int nextend = intervals[i][1];

            if (nextstart <= curend) {
                cur[1] = Math.max(curend, nextend);
            } else {
                cur = intervals[i];
                al.add(cur);
            }
        }
        return al.toArray(new int[al.size()][]);
    }
}
       