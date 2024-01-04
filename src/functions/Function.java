package functions;

import java.util.Arrays;

public class Function {
    public boolean isAnagram(String word1, String word2) {
        char[] arrayOne = word1.toCharArray(); //separate the word in char array
        char[] arrayTwo = word2.toCharArray();

        Arrays.sort(arrayOne);//order the letters
        Arrays.sort(arrayTwo);

        return Arrays.equals(arrayOne, arrayTwo);//compare the arrays to know if they're equals
    }
}
