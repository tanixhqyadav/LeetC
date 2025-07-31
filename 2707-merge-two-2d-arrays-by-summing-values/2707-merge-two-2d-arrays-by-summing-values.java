class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                result.add(Arrays.asList(nums1[i][0], nums1[i][1] + nums2[j][1]));
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                result.add(Arrays.asList(nums1[i][0], nums1[i][1]));
                i++;
            } else {
                result.add(Arrays.asList(nums2[j][0], nums2[j][1]));
                j++;
            }
        }

        while (i < nums1.length) {
            result.add(Arrays.asList(nums1[i][0], nums1[i][1]));
            i++;
        }

        while (j < nums2.length) {
            result.add(Arrays.asList(nums2[j][0], nums2[j][1]));
            j++;
        }
        int[][] mergedArray = new int[result.size()][2];
        for (int k = 0; k < result.size(); k++) {
            mergedArray[k][0] = result.get(k).get(0);
            mergedArray[k][1] = result.get(k).get(1);
        }
        return mergedArray;
    }
}