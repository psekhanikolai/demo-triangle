package by.itacademy.nikolaipsekha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianglesTest {
    public String expectedTriangle(int a, int b, int c, String name) {
        return "Треугольник a=" + a + ", b= " + b + ", c= " + c + " - " + name;
    }

    @Test
    public void testDefineTriangle1() {
        Assertions.assertEquals(expectedTriangle(2, 2, 2, "равносторонний треугольник"), Triangles.defineTriangle(2, 2, 2));

    }

    @Test
    public void testDefineTriangle2() {
        Assertions.assertEquals(expectedTriangle(2, 2, 4, "равнобедренный треугольник"), Triangles.defineTriangle(2, 2, 4));

    }

    @Test
    public void testDefineTriangle3() {
        Assertions.assertEquals(expectedTriangle(2,7,6, "обычный треугольник"), Triangles.defineTriangle(2, 7, 6));

    }

    @Test
    public void testDefineTriangle4() {
        Assertions.assertEquals(expectedTriangle(3, 4, 5, "прямоугольный треугольник"), Triangles.defineTriangle(3, 4, 5));

    }

    @Test
    public void testDefineTriangle5() {
        Assertions.assertEquals(expectedTriangle(2, 2, -2, "не является треугольником"), Triangles.defineTriangle(2, 2, -2));

    }

    @Test
    public void testDefineTriangle6() {
        Assertions.assertEquals(expectedTriangle(7, 7, 7, "равносторонний треугольник"), Triangles.defineTriangle(7, 7, 7));

    }

    @Test
    public void testDefineTriangle7() {
        Assertions.assertEquals(expectedTriangle(20, 22, 20, "равнобедренный треугольник"), Triangles.defineTriangle(20, 22, 20));

    }

    @Test
    public void testDefineTriangle8() {
        Assertions.assertEquals(expectedTriangle(0, 2, 0, "не является треугольником"), Triangles.defineTriangle(0, 2, 0));

    }

}

