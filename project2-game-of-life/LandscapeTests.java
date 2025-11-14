/*
file name:      LandscapeTests.java
Authors:        Naser Al Madi
last modified:  11/13/2025

How to run:     java -ea LandscapeTests
*/


import java.util.ArrayList;

public class LandscapeTests {

    public static void landscapeTests() {

        // case 1: testing Landscape(int, int)
        {
            // given
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // when
            System.out.println(l1);
            System.out.println("\n");
            System.out.println(l2);

            // then
            assert l1 != null : "Error in Landscape::Landscape(int, int)";
            assert l2 != null : "Error in Landscape::Landscape(int, int)";
        }

        // case 2: testing reset()
        {
            // given


            // when


            // then

        }

        // case 3: testing getRows()
        {
            // given


            // when


            // then

        }

        // case 4: testing getCols()
        {
            // given


            // when


            // then

        }

        // case 5: testing getCell(int, int)
        {
            // given


            // when


            // then

        }

        // case 6: testing getNeighbors()
        {
            // given


            // when


            // then

        }

        // case 7: testing advance()
        {
            // given


            // when


            // then

        }

    }


    public static void main(String[] args) {

        landscapeTests();
    }
}
