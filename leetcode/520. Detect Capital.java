class Solution {
    public boolean detectCapitalUse(String word) {
        boolean firstWord = false;
        int count=0;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z') firstWord = true;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
            count++;
        }
        return ((count==1 && firstWord) || count == word.length() || count==0);
    }
}