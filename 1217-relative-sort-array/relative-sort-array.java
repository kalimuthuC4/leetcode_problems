class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length];
        
        int c=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i] == arr1[j])
                {arr[c] = arr1[j];
                c++;
                }
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    arr1[i] = 123456;
                }
            }
            System.out.print(arr1[i]+" ");
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=123456)
            {
                arr[c] = arr1[i];
                c++;
            }
            System.out.print(arr1[i]+" ");
        }
        return arr;
    }
}