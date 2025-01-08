package by.itacademy.nikolaipsekha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianglesTest {
    public String expectedTriangle( int a, int b, int c, String name){
        return "Треугольник a=" + a + ", b= " + b +  ", c= " + c +  " - " + name;
    }
@Test
    public void testDefineTriangle1(){
    Assertions.assertEquals(expectedTriangle(2,2,2,"равносторонний треугольник") , Triangles.defineTriangle(2,2,2));
}
}
