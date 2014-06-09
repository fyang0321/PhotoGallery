package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = new String[] {"fooo","barr","wing","ding","wing"};
		System.out.println(
				findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", test));
	}
	
	public static List<Integer> findSubstring(String S, String[] L) {
        return find(S, L);
    }
    
    private static List<Integer> find(String S, String[] L) {
        List<Integer> result = new ArrayList<Integer>();
        if (S == null)
            return result;
            
        int lenS = S.length();
        if (lenS == 0 || L.length == 0)
            return result;
            
        int wordLen = L[0].length();
        if (wordLen > lenS)
            return result;
        //There is duplicates in dic, so set does not work.    
        Map<String, Integer> words = new HashMap<String, Integer>();
        for(String s : L) {
            if (words.containsKey(s))
                words.put(s, words.get(s) + 1);
            else
                words.put(s, 1);
        }
        Map<String, Integer> curWords = new HashMap<String, Integer>();
            
        for (int i = 0; i <= lenS - wordLen * L.length; i++) {
            curWords.clear();
            String word = S.substring(i, i + wordLen);
            int j = i;
            while (words.containsKey(word) && 
                    (!curWords.containsKey(word) || curWords.get(word) < words.get(word))) {
                if (curWords.containsKey(word))
                    curWords.put(word, curWords.get(word) + 1);
                else
                    curWords.put(word, 1);
                    
                if (curWords.size() == L.length)
                    break;
                j = j + wordLen;
                if (j + wordLen > lenS)
                    break;
                word = S.substring(j, j + wordLen);
            }
            
            if (curWords.size() == L.length)
                result.add(i);
        }
        
        return result;
    }

}
