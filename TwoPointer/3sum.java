class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0;i<nums.length - 2;i++){
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
        int left = i+1;
        int right = nums.length - 1;
        while(left<right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                 ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);                                      
                    left++;
                    right--;
            
        while(left<right && nums[left] == nums[left-1]){
            left++;
        }
        while(left<right && nums[right] == nums[right+1]){
            right--;
        }

        }else if(sum < 0){
            left++;
        }else{
            right--;
        }
      }
    }
    return result;
    }
}
