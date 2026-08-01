class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> rev = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if (hm.containsKey(ch)) {
                if (hm.get(ch) != ch1)
                    return false;
            } else {
                if (rev.containsKey(ch1))
                    return false;

                hm.put(ch, ch1);
                rev.put(ch1, ch);
            }
        }

        return true;
    }
}