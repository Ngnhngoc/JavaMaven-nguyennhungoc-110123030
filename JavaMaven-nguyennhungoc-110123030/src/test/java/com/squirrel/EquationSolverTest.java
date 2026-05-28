package com.squirrel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EquationSolverTest {
    EquationSolver solver = new EquationSolver();

    @Test
    public void testVoSoNghiem() {
        System.out.println("-> Dang chay Kiem thu: Truong hop VO SO NGHIEM");
        assertEquals("VSN", solver.giaiPhuongTrinhBac1(0, 0));
    }

    @Test
    public void testVoNghiem() {
        System.out.println("-> Dang chay Kiem thu: Truong hop VO NGHIEM");
        assertEquals("VN", solver.giaiPhuongTrinhBac1(0, 5));
    }

    @Test
    public void testCoNghiem() {
        System.out.println("-> Dang chay Kiem thu: Truong hop CO NGHIEM");
        assertEquals("CN", solver.giaiPhuongTrinhBac1(2, -4));
    }
}