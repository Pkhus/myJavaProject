package lesson_12t;


import lesson_12.PerTriangle;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
   // private PerTriangle triangle;
    @BeforeAll
   static void initAll() {

        System.out.println("@Before ALL");
    }



    @Test
    void addition() {

        assertEquals(23.525, PerTriangle.AreaTriangle(6, 8, 9));
    }

    @AfterAll
   static  void endAll() {
        System.out.println("@After ALL");

    }


}
