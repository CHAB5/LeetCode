class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0,j=0,k=0;
        int[] sorted = new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]>nums2[j])
            {
                sorted[k] = nums2[j];
                k++;
                j++;
            }
            else{
                sorted[k] = nums1[i];
                k++;
                i++;
            }
        }
        
        if(j==n)
        {
            while(i<m){
                sorted[k] = nums1[i];
                k++;
                i++;
            }
        }
        
        if(i==m)
        {
            while(j<n)
            {
                sorted[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        
        
        for(int a=0; a<(m+n); a++)
        {
            nums1[a] = sorted[a];
        }
    }
}