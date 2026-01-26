package Klasses;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testCreate() {
        Adresse a1 = new Adresse("Test", "1", "12345", "Dortmund", "Deutschland");

        Student s1 = new Student("Ali", 50, 123456789, a1);

        assertNotNull(s1);
        assertEquals("Ali", s1.getName());
        assertEquals(50, s1.getAlter());
        assertEquals(123456789, s1.getMatrikelnummer());
        assertEquals("Test", s1.getAdresse().getStrasse());
    }

}