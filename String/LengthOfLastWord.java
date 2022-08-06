class Solution {
    public int lengthOfLastWord(String s) {
        String [] words=s.split(" ");
        if(words.length<=0){
            return 0;
        }
        int wordLen=words[words.length-1].length();
        return wordLen;
    }
}
