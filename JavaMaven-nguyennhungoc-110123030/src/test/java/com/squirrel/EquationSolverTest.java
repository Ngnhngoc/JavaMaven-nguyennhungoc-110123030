package com.squirrel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EquationSolverTest {
    EquationSolver solver = new EquationSolver();

    @Test
    public void testVoSoNghiem() {
        assertEquals("VSN", solver.giaiPhuongTrinhBac1(0, 0));
    }

    @Test
    public void testVoNghiem() {
        assertEquals("VN", solver.giaiPhuongTrinhBac1(0, 5));
    }

    @Test
    public void testCoNghiem() {
        assertEquals("CN", solver.giaiPhuongTrinhBac1(2, -4));
    }
}