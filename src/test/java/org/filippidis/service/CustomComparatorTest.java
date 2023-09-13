package org.filippidis.service;

import org.filippidis.model.Student;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CustomComparatorTest {

    @Test
    public void testCustomComparator() {
        Student student1 = new Student(33, "Rumpa", 3.68);
        Student student2 = new Student(85, "Ashis", 3.85);
        Student student3 = new Student(56, "Samiha", 3.75);
        Student student4 = new Student(19, "Samara", 3.75);
        Student student5 = new Student(22, "Fahim", 3.76);

        Comparator<? super Student> comparator = CustomComparator.customComparator();

        assertEquals(-1, comparator.compare(student1, student2)); // Because student2 (Ashis) has higher CGPA
        assertTrue(comparator.compare(student4, student3) > 0);   // Both have same CGPA, but Samara comes alphabetically before Samiha
        assertEquals(-1, comparator.compare(student4, student5)); // Because student5 (Fahim) has higher CGPA than student4 (Samara)
        assertEquals(0, comparator.compare(student3, student3));  // The same student, so should be equal
        assertEquals(1, comparator.compare(student5, student1));  // Because student1 (Rumpa) has lower CGPA than student5 (Fahim)
        // ... add more tests as needed
    }

}