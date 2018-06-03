package com.lockward.anubis;

public class FizzBuzz {
    public String print(int n) {
        if (isDivisibleByFiveAndThree(n)) {
            return "FizzBuzz";
        } else if (isDivisibleByFive(n)) {
            return "Buzz";
        } else if (isDivisibleByThree(n)) {
            return "Fizz";
        } else {
            return Integer.toString(n);
        }
    }

    private boolean isDivisibleByThree(int n) {
        return n % 3 == 0;
    }

    private boolean isDivisibleByFive(int n) {
        return n % 5 == 0;
    }

    private boolean isDivisibleByFiveAndThree(int n) {
        return isDivisibleByThree(n) && isDivisibleByFive(n);
    }
}
