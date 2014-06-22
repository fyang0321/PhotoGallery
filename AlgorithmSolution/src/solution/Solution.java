package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
//	    List<List<Character>> lists = new ArrayList<List<Character>>();
//	    List<Character> l1 = new ArrayList<Character>();
//	    l1.add('a'); l1.add('b');; l1.add('c');
//	    List<Character> l2 = new ArrayList<Character>();
//	    l2.add('#');
//	    List<Character> l3 = new ArrayList<Character>();
//	    l3.add('1'); l3.add('2');
//	    lists.add(l1); lists.add(l2); lists.add(l3);
//
//	    List<String> result = new ArrayList<String>();
//	    GenerateCombinations(lists, result, 0, new StringBuilder());
//
//	    System.out.println(result);
		String[] f1 = new String[] {"cinema","host","aba","train"};
		String[] f2 = new String[] {"cinema","host","aba","train"};
		
		check_anagrams(f1, f2);
	}
	
	    public static void check_anagrams(String[] firstWords, String[] secondWords) {
	        // Write your code here
	        // To print results to the standard output you can use System.out.println()
	        // Example: System.out.println("Hello world!");
	        int[] table = new int[26];
	        for (int i = 0; i < firstWords.length; i++) {
	            String str1 = firstWords[i];
	            String str2 = secondWords[i];
	            int len1 = str1.length(), len2 = str2.length();
	            if (len1 != len2) {
	                System.out.println(0);
	                continue;
	            }
	            for (int j = 0; j < len1; j++) {
	                char c = str1.charAt(j);
	                table[c - 'a']++;
	            }
	            boolean isAnagram = true;
	            for (int k = 0; k < len2; k++) {
	                char c = str2.charAt(k);
	                int index = c - 'a';
	                table[index]--;
	                if (table[index] < 0)
	                    isAnagram = false;
	            }
	            if (isAnagram)
	                System.out.println(1);
	            else
	                System.out.println(0);
	            for (int m = 0; m < 26; m++)
	                table[m] = 0;
	        }
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
