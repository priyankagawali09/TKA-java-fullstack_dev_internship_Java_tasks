import java.util.*;
public class anagram{
	public static void main(String[] args) {
    String word1 = "priyanka";
    String word2 = "priyankk";

    if(word1.length() == word2.length()){

        String w1 = word1.toLowerCase();
        String w2 = word2.toLowerCase();
        char[] ch1= w1.toCharArray();
        char[] ch2 = w2.toCharArray();

      Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            System.out.println(word1+ " and "+ word2 +" are anagrams.");
        }else{
            System.out.println(word1+" and "+ word2 +" are not anagrams.");
        }
    }else{
        System.out.println(word1+" and "+ word2 +" are not anagrams.");
    }
	}
}   
