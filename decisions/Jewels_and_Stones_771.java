//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        Set<Character> setOfTheJewels = new HashSet();
        for(int i = 0; i < jewels.length(); ++i){
            setOfTheJewels.add(jewels.charAt(i));
        }
        for(int i = 0; i < stones.length(); ++i){
            if(setOfTheJewels.contains(stones.charAt(i)))
                ++counter;
        }
        return counter;
    }
}
