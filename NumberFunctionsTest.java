public class NumberFunctionsTest {

    // Function 1: Check if the input integer is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Function 2: Check if the input integer is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function 3: Check if the input integer is odd (inverse of isEven)
    public static boolean isOdd(int n) {
        return !isEven(n);
    }

    // Function 4: Check if the input integer is composite (non-prime and greater than 1)
    public static boolean isComposite(int n) {
        return n > 1 && !isPrime(n);
    }

    // Test cases for checking the "isEven" function
    
    public void testIsEven() {
        assertTrue(isEven(2));   // 2 is even
        assertTrue(isEven(0));   // 0 is even
        assertFalse(isEven(3));  // 3 is odd
        assertFalse(isEven(-1)); // -1 is odd
    }

    // Test cases for checking the "isPrime" function
    
    public void testIsPrime() {
        assertTrue(isPrime(2));   // 2 is prime
        assertTrue(isPrime(3));   // 3 is prime
        assertFalse(isPrime(4));  // 4 is not prime
        assertFalse(isPrime(1));  // 1 is not prime
        assertFalse(isPrime(0));  // 0 is not prime
        assertFalse(isPrime(-5)); // Negative numbers are not prime
    }

    // Test cases for checking the "isOdd" function
    
    public void testIsOdd() {
        assertFalse(isOdd(2));   // 2 is even, so should be false for odd
        assertFalse(isOdd(0));   // 0 is even, so should be false for odd
        assertTrue(isOdd(3));    // 3 is odd
        assertTrue(isOdd(-1));   // -1 is odd
    }

    // Test cases for checking the "isComposite" function
  
    public void testIsComposite() {
        assertFalse(isComposite(2));   // 2 is prime, not composite
        assertFalse(isComposite(3));   // 3 is prime, not composite
        assertTrue(isComposite(4));    // 4 is composite
        assertFalse(isComposite(1));   // 1 is neither prime nor composite
        assertFalse(isComposite(0));   // 0 is not composite
        assertTrue(isComposite(9));    // 9 is composite
    }

    // Main method to run the tests directly
    public static void main(String[] args) {
       
    }

    private void assertTrue(boolean even) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertFalse(boolean even) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
