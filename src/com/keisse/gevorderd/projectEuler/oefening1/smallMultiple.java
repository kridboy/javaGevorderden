package com.keisse.gevorderd.projectEuler.oefening1;

import java.util.stream.LongStream;

public class smallMultiple {
    public static void main(String[] args) {
        smallMultiple sm = new smallMultiple();
        Long y = 22L;
        while(sm.checkNR(y)!=10) y++;
        System.out.println(y);
    }

    int checkNR(Long nr) {
        int hmm=0;
        for (int i = 20; i >= 11; i--) {
            if (nr % i == 0) hmm++;
        }
        return hmm;
    }
}
//        System.out.println(
//                LongStream.range(0, 999999999999999999L)
//                .filter(e -> e % 11 == 0 && e % 12 == 0 && e % 13 == 0 && e % 14 == 0 && e % 15 == 0 && e % 16 == 0 && e % 17 == 0 && e % 18 == 0 && e % 19 == 0 && e % 20 == 0)
//                .findFirst()
//                );