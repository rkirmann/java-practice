package seatplanner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeatingPlannerTest {

    @Test
    void testPlanSeating() {
        List<Student> students = Arrays.asList(
                new Student("Alice", true, Arrays.asList("Bob")),
                new Student("Bob", false, Arrays.asList("Alice", "Charlie")),
                new Student("Charlie", false, Arrays.asList("Bob"))
        );

        String[][] expected = {
                {"Alice", "Bob"},
                {"Charlie", null}
        };

        assertArrayEquals(expected, SeatingPlanner.planSeating(students, 2, 2));
    }

    // TODO: Add at least three more tests
}
