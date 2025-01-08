package by.itacademy.nikolaipsekha;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            return "Треугольник a=..., b=..., c=... не является треугольником";
        }

    }
