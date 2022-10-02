class QuickSort {
    public int[] sortArray(int[] nums) {
        int low = 0,high = nums.length-1;
        QuickSortMethod(nums,low,high);
        return nums;
    }
    public void QuickSortMethod(int[] nums,int low,int high) {
        if (low < high) {
            int pivot = partition(nums,low,high);
            QuickSortMethod(nums,low,pivot-1);
            QuickSortMethod(nums,pivot+1,high);
        }
    }

    public int partition(int[]nums,int low,int high) {
        int pivot = nums[low];
        int i = low,j = high;
        while(i < j) {
            while(nums[i] <= pivot && i < j) i++;
            while(nums[j] > pivot) j--;
            if(i < j) swap(nums,i,j);
        }
        swap(nums,low,j);
        return j;
    }

    public void swap(int[]nums,int low,int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        QuickSort ob = new QuickSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.sortArray(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}