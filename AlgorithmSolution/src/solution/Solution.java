package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = new int[] {1, 1, 1, 2};
		System.out.println(combinationSum2(num, 3));
	}
	
	 public static List<List<Integer>> combinationSum2(int[] num, int target) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if (target <= 0)
	            return result;
	            
	        Arrays.sort(num);
	        getCombinationSum(num, target, 0, new ArrayList<Integer>(), result);
	        
	        return result;
	    }
	    
	    private static void getCombinationSum(int[] num, int target, int start,
	        List<Integer> solution, List<List<Integer>> result) {
	            if (target == 0) {
	                result.add(new ArrayList<Integer>(solution));
	            } else {
	                for (int i = start; i < num.length; i++) {
	                    if ((i > start && num[i] == num[i-1]) || num[i] > target)
	                        continue;
	                    solution.add(num[i]);
	                    getCombinationSum(num, target - num[i], i + 1, solution, result);
	                    solution.remove(solution.size() - 1);
	                }
	            }
	    }

}
