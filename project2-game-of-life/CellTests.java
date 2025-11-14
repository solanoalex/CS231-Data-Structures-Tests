/*
file name:      CellTests.java
Authors:        Naser Al Madi
last modified:  11/13/2025

How to run:     java -ea CellTests
*/


import java.util.ArrayList;

public class CellTests {

    public static void cellTests() {

        // case 1: testing Cell() and Cell(Bool)
        {
            // given
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // when
            System.out.println(c1 + " == 0");
            System.out.println(c2 + " == 1");
            System.out.println(c3 + " == 0");

            // then
            assert c1 != null : "Error in Cell::Cell()";
            assert c2 != null : "Error in Cell::Cell(bool)";
            assert c3 != null : "Error in Cell::Cell(bool)";
        }

        // case 2: testing getAlive()
        {
            // given
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // when
            System.out.println(c1.getAlive() + " == false");
            System.out.println(c2.getAlive() + " == true");
            System.out.println(c3.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::Cell() or Cell::getValue()";
            assert c2.getAlive() == true : "Error in Cell::Cell() or Cell::getValue()";
            assert c3.getAlive() == false : "Error in Cell::Cell() or Cell::getValue()";
        }

        // case 3: testing setAlive()
        {
            // given
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // when
            c1.setAlive(true);
            c2.setAlive(false);
            c3.setAlive(true);

            System.out.println(c1.getAlive() + " == true");
            System.out.println(c2.getAlive() + " == false");
            System.out.println(c3.getAlive() + " == true");

            // then
            assert c1.getAlive() == true : "Error in Cell::getAlive() or Cell::setAlive()";
            assert c2.getAlive() == false : "Error in Cell::getAlive() or Cell::setAlive()";
            assert c3.getAlive() == true : "Error in Cell::getAlive() or Cell::setAlive()";
        }

        // case 4: testing reset()
        {
            // given
            Cell c1 = new Cell();
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);

            // when
            c1.reset();
            c2.reset();
            c3.reset();

            System.out.println(c1.getAlive() + " == false");
            System.out.println(c2.getAlive() + " == false");
            System.out.println(c3.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::getAlive() or Cell::reset()";
            assert c2.getAlive() == false : "Error in Cell::getAlive() or Cell::reset()";
            assert c3.getAlive() == false : "Error in Cell::getAlive() or Cell::reset()";
        }

        // case 5: testing updateState()
        {
            // given
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(false);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 6: testing updateState()
        {
            // given
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 7: testing updateState()
        {
            // given
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);
            
            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == true");

            // then
            assert c1.getAlive() == true : "Error in Cell::updateState()";
        }

        // case 8: testing updateState()
        {
            // given
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);
            
            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == true");

            // then
            assert c1.getAlive() == true : "Error in Cell::updateState()";
        }

        // case 9: testing updateState()
        {
            // given
            Cell c1 = new Cell(true);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(true);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 10: testing updateState()
        {
            // given
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(false);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 11: testing updateState()
        {
            // given
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(false);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 12: testing updateState()
        {
            // given
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(false);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // case 13: testing updateState()
        {
            // given
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(false);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == true");

            // then
            assert c1.getAlive() == true : "Error in Cell::updateState()";
        }

        // case 14: testing updateState()
        {
            // given
            Cell c1 = new Cell(false);
            Cell c2 = new Cell(true);
            Cell c3 = new Cell(true);
            Cell c4 = new Cell(true);
            Cell c5 = new Cell(true);

            ArrayList<Cell> neighbors = new ArrayList<Cell>();
            neighbors.add(c2);
            neighbors.add(c3);
            neighbors.add(c4);
            neighbors.add(c5);

            // when
            c1.updateState(neighbors);

            System.out.println(c1.getAlive() + " == false");

            // then
            assert c1.getAlive() == false : "Error in Cell::updateState()";
        }

        // no test for toString(), students could format string differently

        System.out.println("*** Done testing Cell! ***\n");
    }


    public static void main(String[] args) {

        cellTests();
    }
}
