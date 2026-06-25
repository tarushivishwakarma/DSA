class Solution {

    public static ArrayList<Integer> increasingNumbers(int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= 9; i++)
                ans.add(i);
            return ans;
        }

        if (n > 9)
            return ans;

        generate(1, n, "", ans);

        return ans;
    }

    static void generate(int start, int n, String s, ArrayList<Integer> ans) {

        if (s.length() == n) {
            ans.add(Integer.parseInt(s));
            return;
        }

        for (int i = start; i <= 9; i++) {
            generate(i + 1, n, s + i, ans);
        }
    }
}