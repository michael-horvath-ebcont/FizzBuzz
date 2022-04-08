package com.company;


import org.junit.jupiter.api.Test;

class MainTest {

    /*
    Program:
        1. User enters a number into terminal
        2. Program decides:
            * number % 3 ==0: print number Fizz
            * number % 5 ==0: print number fuzz
            * both: print number FizzBuzz
     */

    @Test
    void enter_normal_number() {
        String expected = "4";
        String actual = FizzBuzz.run(4);

    }

}