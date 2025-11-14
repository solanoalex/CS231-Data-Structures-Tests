/*
file name:      DeckTests.java
Authors:        Naser Al Madi
last modified:  11/13/2025

How to run:     java -ea DeckTests
*/


public class DeckTests {

    public static void deckTests() {

        // case 1: testing Deck() and size()
        {
            // given
            Deck d1 = new Deck();

            // when
            System.out.println(d1);

            // then
            assert d1 != null : "Error in Deck::Deck()";
            assert d1.size() == 52 : "Error in Deck::Deck()";
        }

        // case 2: testing deal()
        {
            // given
            Deck d1 = new Deck();

            // when

            // then
            Card c1 = d1.deal();

            assert d1 != null : "Error in Deck::deal()";
            assert c1 != null : "Error in Deck::deal()";
            assert d1.size() == 51 : "Error in Deck::deal()";
        }

        // case 3: testing build()
        {
            // given
            Deck d1 = new Deck();

            // when

            // then
            Card c1 = d1.deal();
            Card c2 = d1.deal();
            Card c3 = d1.deal();
            d1.build();

            assert d1 != null : "Error in Deck::build()";
            assert c1 != null : "Error in Deck::deal()";
            assert c2 != null : "Error in Deck::deal()";
            assert c3 != null : "Error in Deck::deal()";
            assert d1.size() == 52 : "Error in Deck::build()";
        }

        // case 4: testing shuffle()
        {
            // given
            Deck d1 = new Deck();

            // when
            String before = d1.toString();
            d1.shuffle();
            String after = d1.toString();

            // then
            assert !before.equals(after) : "Error in Deck::shuffle()";
            assert d1.size() == 52 : "Error in Deck::shuffle()";
        }

        // todo: add case to check correct number of each card
        // todo: add case to check reshuffle thingy

        System.out.println("*** Done testing Deck! ***\n");

    }


    public static void main(String[] args) {

        deckTests();
    }
}