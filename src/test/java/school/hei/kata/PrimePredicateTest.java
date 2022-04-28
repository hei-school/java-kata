package school.hei.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PrimePredicateTest {

    PrimePredicate subject;

    @BeforeEach
    void setUp() {
        subject = new PrimePredicate();
    }

    @Test
    void negative_is_illegal() {
        assertThrows(IllegalArgumentException.class, () -> subject.test(-1));
    }

    @Test
    void nonNegative_is_correct() {
        throw new RuntimeException("TODO");
    }
}