package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionBishop() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertSame(bishopBlack.position(), Cell.C1);
    }

    @Test
    public void wayBishop() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] exception = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(bishopBlack.way(Cell.G5), exception);
    }

    @Test
    public void copyBishop() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertSame(bishopBlack.copy(Cell.D2).position(), Cell.D2);
    }

    @Test
    public void isDiagonalBishopIsOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertTrue(bishopBlack.isDiagonal(Cell.C1, Cell.G5));
    }

    @Test
    public void isDiagonalBishopNotOk() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(Cell.C1, Cell.C2));
    }
}