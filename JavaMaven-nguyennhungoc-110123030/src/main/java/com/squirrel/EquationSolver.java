package com.squirrel;

public class EquationSolver {
    public String giaiPhuongTrinhBac1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "VSN"; 
            } else {
                return "VN";  
            }
        } else {
            return "CN";      
        }
    }
}