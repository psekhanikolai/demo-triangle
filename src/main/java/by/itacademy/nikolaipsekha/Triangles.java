package by.itacademy.nikolaipsekha;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            return "Треугольник a=" + a + ", b= " + b +  ", c= " + c +  " - не является треугольником";
        }
        if (a == b & b == c) {
            return "Треугольник a=" + a + ", b= " + b +  ", c= " + c + " - равносторонний треугольник";

        } else if (a == b || a == c || b == c) {
            return "Треугольник a=" + a + ", b= " + b +  ", c= " + c + " - равнобедренный треугольник";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
            return "Треугольник a=" + a + ", b= " + b +  ", c= " + c + " - прямогульный треугольник";
        }
        else
            return "Треугольник a=" + a + ", b= " + b +  ", c= " + c + " - обычный треугольник";
        }
    }


