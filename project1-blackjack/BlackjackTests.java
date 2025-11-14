/*
file name:      BlackjackTests.java
Authors:        Naser Al Madi
last modified:  11/13/2025

How to run:     java -ea BlackjackTests
*/


public class BlackjackTests {

    public static void blackjackTests() {

        // case 1: testing Blackjack() and Blackjack(i)
        {
            // given
            Blackjack bj1 = new Blackjack();
            Blackjack bj2 = new Blackjack(5);

            // when

            // then
            assert bj1 != null : "Error in Blackjack::Blackjack()";
            assert bj2 != null : "Error in Blackjack::Blackjack()";
        }
       
        System.out.println("*** Done testing Blackjack! ***\n");
    }


    public static void main(String[] args) {

        blackjackTests();
    }
}