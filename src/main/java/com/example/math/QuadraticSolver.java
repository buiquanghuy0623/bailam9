package com.example.math;

public class QuadraticSolver {
    /**
     * Giải phương trình bậc 2: ax^2 + bx + c = 0
     */
    public static double[] solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return new double[]{}; // Vô nghiệm hoặc vô số nghiệm
            }
            return new double[]{-c / b}; // Phương trình bậc 1
        }
        
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[]{}; // Không có nghiệm thực
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x}; // Nghiệm kép
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2}; // Hai nghiệm phân biệt
        }
    }
}
