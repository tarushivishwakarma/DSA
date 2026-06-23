// User function Template for Java
class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        // Your code here
        String result = "";
        
        for(String s : arr){
            result = result + s;
        }
        
        return result;
    }
}