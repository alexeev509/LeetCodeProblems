//https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        LinkedList<Integer> queue = new LinkedList();
        
        for(int i = 1, j = n; i < nums.length; ++i){
            
            queue.addLast(nums[i]);

            if(i%2 == 0)
                nums[i] = queue.pollFirst();
            
            else 
                nums[i] = nums[j++];
            
        }
        return nums;
    }
}

/*
Рассуждения:
[0,1,2,3,4,5,6,7,8,9]
10

//
[0,1,2,3,4,5,6,7,8,9]
Поставить 5 - запомнить (1)
[0,5,2,3,4,5,6,7,8,9]
Поставить 1 - запомнить (2)
[0,5,1,3,4,5,6,7,8,9]
Поставить 6 - запомнить (2,3 )
[0,5,1,6,4,5,6,7,8,9]
Поставить 2 - запомнить (3,4)
[0,5,1,6,2,5,6,7,8,9]
Поставить 7 - запомнить (3,4,5)
[0,5,1,6,2,7,6,7,8,9]
и тд
//
Ответ:
[0,5,1,6,2,7,3,8,4,9]
*/
