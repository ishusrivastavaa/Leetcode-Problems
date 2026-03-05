class Solution {
    public int distributeCandies(int[] arr) {
        Arrays.sort(arr);
      int n = arr.length/2;
      int a=arr[0];
      int count=1;
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]!=a && count<n)
        {
            count++;
            a=arr[i];
        }
      }
      return count;  
    }
}