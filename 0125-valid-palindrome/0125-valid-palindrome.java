class Solution {
    public boolean isPalindrome(String s) {
        String input = s.replaceAll("[^a-zA-Z0-9]", "");
        String lower = input.toLowerCase();
        char[] palindrom = lower.toCharArray();
        for(int i = 0; i<palindrom.length/2; i++){
            char temp = palindrom[i];
            palindrom[i] = palindrom[palindrom.length-1-i];
            palindrom[palindrom.length-1-i]=temp;
        }
        String pal = new String(palindrom);
        return pal.equals(lower);
    }
}