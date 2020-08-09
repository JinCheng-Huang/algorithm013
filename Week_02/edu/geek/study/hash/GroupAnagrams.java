package edu.geek.study.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *  ["ate","eat","tea"],
 *  ["nat","tan"],
 *  ["bat"]
 * ]
 * 说明：
 * 	所有输入均为小写字母。
 *  不考虑答案输出的顺序。
 *  
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GroupAnagrams {

	public static void main(String[] args) {
		String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> list = groupAnagrams(a);
		for (List<String> list2 : list) {
			System.out.println(String.join(",", list2.toArray(new String[1])));
		}
	}

	// 方法 hash
    public static List<List<String>> groupAnagrams(String[] strs) {
    	if(strs == null || strs.length == 0) return null;
        Map<Integer, List<String>> targetMap = new HashMap<>();
        List<String> list = null;
        for (String str : strs) {
        	Integer key = getKey(str);
        	if(key != null) {
        		if(targetMap.containsKey(key)) {
    				list = targetMap.get(key);
    			} else {
    				list = new ArrayList<>();
    				targetMap.put(key, list);
    			}
    			list.add(str);
        	}
		}
        return new ArrayList<List<String>>(targetMap.values());
    }
	
    private static Integer getKey(String str) {
    	if(str != null && !"".equals(str)) {
    		char[] strArray = str.toCharArray();
    		Integer i = Integer.BYTES;
    		for (char c : strArray) {
				i += c;
			}
    		return i;
    	}
    	return null;
    }
}
