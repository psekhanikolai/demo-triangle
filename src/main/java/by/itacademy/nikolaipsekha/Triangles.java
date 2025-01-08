package by.itacademy.nikolaipsekha;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            return "Треугольник a=..., b=..., c=... не является треугольником";
        }
        if (a == b & b == c){
            return "Треугольник a=..., b=..., c=... - равносторонний треугольник";

        } else if (a == b || a==c || b==c) {
            return "Треугольник a=..., b=..., c=... - равнобедренный треугольник";
        }

    }
   }

