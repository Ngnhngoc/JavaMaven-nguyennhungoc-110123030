package com.squirrel;

public class App {
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver();
        
        System.out.println("=======================================");
        System.out.println("  KET QUA BIEN LUAN PHUONG TRINH BAC 1 ");
        System.out.println("=======================================");
        
        System.out.println("Truong hop a = 0, b = 0  -> Dap an: " + solver.giaiPhuongTrinhBac1(0, 0));
        System.out.println("Truong hop a = 0, b = 5  -> Dap an: " + solver.giaiPhuongTrinhBac1(0, 5));
        System.out.println("Truong hop a = 2, b = -4 -> Dap an: " + solver.giaiPhuongTrinhBac1(2, -4));
        
        System.out.println("=======================================");
    }
}