class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double mid = 0;
        var merge = merge(nums1, nums2);
        int len = merge.length;
        if (len % 2 == 0)
            mid = (double) (merge[len/2 - 1] + merge[len/2]) / 2;
        else
            mid = merge[len / 2];
        return mid;
    }
    private static int[] merge(int[] nums1, int[] nums2){
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merge = new int[l1 + l2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l1 && j < l2){
            if (nums1[i] < nums2[j])
                merge[k++] = nums1[i++];
            else
                merge[k++] = nums2[j++];
        }
        while (i < l1)
            merge[k++] = nums1[i++];
        while (j < l2)
            merge[k++] = nums2[j++];

        return merge;
    }
}