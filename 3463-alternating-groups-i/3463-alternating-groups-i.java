class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
    //     int nums[]=new int [colors.length+2];
    //     nums[0]=colors[colors.length-1];
    //     int count=0;
    //     nums[nums.length-1]=colors[0];
    //     int j=0;
    //     for(int i=1 ; i<nums.length-1 ; i++){
    //         nums[i]=colors[j];
    //         j++;

    //     }
    //     for(int i=1 ; i<nums.length-1 ; i++){
    //         if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    int count=0;
    for(int i=1 ; i<colors.length-1 ; i++){
        if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1]){
            count++;
        }
    }
    if(colors[0]!=colors[1] && colors[0]!=colors[colors.length-1]){
        count++;
    }
    if(colors[colors.length-1]!=colors[colors.length-2]&& colors[colors.length-1]!=colors[0]){
        count++;

    }
    return count;

    
}
}