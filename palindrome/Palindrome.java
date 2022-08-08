package projects.fw.palindrome;

import java.util.ArrayList;

public class Palindrome {
    public static boolean isPalindrome(String sentence){

        int len = sentence.length();
        int i = 0;

        while (i<len){
            if(sentence.charAt(i) != sentence.charAt(len -1 -i)){
                return false;
            }i++;
        }return true;
    }

    public static ArrayList<String> longestPalindrome(String sentence){

        String [] splitWords = sentence.replaceAll("[^a-zA-Z0-9]", " ").split(" ");


        ArrayList<String> longest = new ArrayList<>();
        ArrayList<String> palindromeList = new ArrayList<>();
        int palindromeLen = 0;


        for (String element:splitWords) {
            if(element.length()>=3 && isPalindrome(element)){
                palindromeList.add(element);
            }
        }
        for (String element:palindromeList) {
            if (element.length() > palindromeLen){
                palindromeLen = element.length();
            }
        }
        for (String element:palindromeList) {
            if(element.length() == palindromeLen){
                longest.add(element.toLowerCase());
            }
        }


        return longest;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("repaper moon mom noon wow "));
    }
}
