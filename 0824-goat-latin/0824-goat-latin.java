class Solution {

    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) != -1) {
                ans.append(word);
            } else {
                ans.append(word.substring(1));
                ans.append(word.charAt(0));
            }

            ans.append("ma");

            for (int j = 0; j <= i; j++) {
                ans.append('a');
            }

            if (i != words.length - 1)
                ans.append(" ");
        }

        return ans.toString();
    }
}