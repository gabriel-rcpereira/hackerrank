package challenges.string;

import java.util.HashSet;
import java.util.Set;

public class WeightedString {

    static String[] weightedUniformStrings(String s, int[] queries) {
        final char[] inputLettersArr = s.toCharArray();
        final Set<Integer> weightedLetters = new HashSet<>();

        int amountOfUniformLetters = 1;
        int lastAlphaNum = 0;
        for(int i=0 ;i< inputLettersArr.length; i ++){
            int alphaNum = inputLettersArr[i] -'a' + 1;
            if(alphaNum == lastAlphaNum){
                amountOfUniformLetters++;
            }
            else{
                amountOfUniformLetters = 1;
                lastAlphaNum = alphaNum;
            }
            int num = (alphaNum) * amountOfUniformLetters;
            weightedLetters.add(num);
        }

        String[] queriesValue = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            queriesValue[i] = weightedLetters.contains(queries[i]) ? "Yes" : "No";
        }

        return queriesValue;
    }
}
