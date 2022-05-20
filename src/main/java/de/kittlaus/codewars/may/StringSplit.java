package de.kittlaus.codewars.may;


/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it
should replace the missing second character of the final pair with
an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
*/

public class StringSplit {

    public static String[] solution(String s) {
        if (s.length()%2!=0){s += "_";}
        String[] sArr = new String[s.length()/2];
        int counter = 0;
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = s.substring(counter,counter+2);
            counter += 2;
        }
        return sArr;
    }

}
