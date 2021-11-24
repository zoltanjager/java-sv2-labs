package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {
        Prime prime = new Prime();
        assertEquals(false, prime.isPrime(-4));
        assertEquals(false, prime.isPrime(0));
        assertEquals(false, prime.isPrime(1));
        assertEquals(true, prime.isPrime(2));
        assertEquals(false, prime.isPrime(6));
        assertEquals(true, prime.isPrime(11));
    }
}