class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert strings to character arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
