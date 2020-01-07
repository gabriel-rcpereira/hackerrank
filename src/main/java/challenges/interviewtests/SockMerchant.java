package challenges.interviewtests;

import java.util.*;

public class SockMerchant {

    public static int sockMerchant(int n, int[] ar) {
        Set<Integer> auxSet = new HashSet<>();
        int pairNumber = 0;
        for (int index = 0; index < n; index++) {
            int number = ar[index];
            if (!auxSet.contains(number)){
                auxSet.add(number);
            } else {
                auxSet.remove(number);
                pairNumber++;
            }
        }

        return pairNumber;
    }
}
