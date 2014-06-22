package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    List<List<Character>> lists = new ArrayList<List<Character>>();
	    List<Character> l1 = new ArrayList<Character>();
	    l1.add('a'); l1.add('b');; l1.add('c');
	    List<Character> l2 = new ArrayList<Character>();
	    l2.add('#');
	    List<Character> l3 = new ArrayList<Character>();
	    l3.add('1'); l3.add('2');
	    lists.add(l1); lists.add(l2); lists.add(l3);

	    List<String> result = new ArrayList<String>();
	    GenerateCombinations(lists, result, 0, new StringBuilder());

	    System.out.println(result);
	}


	public static void GenerateCombinations(List<List<Character>> Lists, List<String> result, int listIndex, StringBuilder combo)
	{
	    if(listIndex == Lists.size()) {
	       result.add(combo.toString());       
	    } else {
	        for(int i = 0; i < Lists.get(listIndex).size(); ++i)
	        {
	            combo.append(Lists.get(listIndex).get(i));
	            GenerateCombinations(Lists, result, listIndex + 1, combo);
	            combo.deleteCharAt((combo.length() - 1));
	        }
	    }
	}

}
