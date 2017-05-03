public class Solution {
    public boolean isAnagram(String s, String t) {
        if(("".equals(s)) && ("".equals(t))) return true;
		char[] s1 = s.toCharArray();
		char[] s2 = t.toCharArray();
		if(s1.length != s2.length) return false;
		Arrays.sort(s1);
		Arrays.sort(s2);
		s = String.valueOf(s1);
		t = String.valueOf(s2);
		if(s.equals(t)) return true;
		else return false;
    }
}