public class ArrayCount {
/*
    Given an array of ints, compute recursively the number of times that the value
    11 appears in the array. We'll use the convention of considering only the part
    of the array that begins at the given index. In this way, a recursive call can
    pass index+1 to move down the array. The initial call will pass in index as 0.
    array11([1, 2, 11], 0) → 1
    array11([11, 11], 0) → 2
    array11([1, 2, 3, 4], 0) → 0
*/

    public static int arrayCount(int[] nums, int index){
        if(index>=nums.length)
            return 0;

        if(nums[index]==11){ //if index is equal to 11
            System.out.println("nums[index]:  "+nums[index]+" index:  "+index +" nums"+nums);
            return 1 + arrayCount(nums,index+1);
        }
        else{

            return arrayCount(nums,index+1);

        }
    }
    public static void main(String[] args) {
        int[] nums={1, 2, 11, 0,1};
        int index = 0;
        arrayCount(nums,index+1);
    }
}
