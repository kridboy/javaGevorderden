package com.keisse.gevorderd.projectEuler.oefening1;

import java.util.ArrayList;
import java.util.List;

public class primefinder {
    List<Long> primes = new ArrayList<>();

    public primefinder(){
        primes.add(2L);
    }
    public static void main(String[] args) {
        primefinder pf = new primefinder();
        pf.Primes();
        pf.primes.get(10001);
    }

    void addPrimes(Long i){
        primes.add(i);
    }

    void Primes() {
        boolean isPrime = false;
        for (Long i = 3L; i <= 999999999; i += 2L) {
            for (Long e : primes) {
                if (i % e != 0) {
                    isPrime = true;
                }
                else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) addPrimes(i);
        }
    }


}
