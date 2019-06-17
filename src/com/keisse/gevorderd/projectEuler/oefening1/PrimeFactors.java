package com.keisse.gevorderd.projectEuler.oefening1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimeFactors {
    Queue<Long> primes = new PriorityQueue<>();
    long it = 0;
    long x, y, z;
    static Long n = 600851475143L;


    public PrimeFactors() {
        primes.offer(2L);
        primes.offer(3L);
    }

    public Queue<Long> getPrimes() {
        return primes;
    }

    public void addPrimes(Long prime) {
        primes.offer(prime);
    }

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        pf.Primes();

        System.out.println(pf.factorOfPrime());

    }

    Long factorOfPrime() {
        Iterator<Long> iterator = primes.iterator();
        Long i = iterator.next();

        while (n / i != 1) {
            while (n % i == 0) {
                n /= i;
            }
            i = iterator.next();
        }
        return n;
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
