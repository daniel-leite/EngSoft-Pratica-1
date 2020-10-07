import static org.junit.Assert.*;

class Franc extends Money {
    Franc(int amount) {
        this.amount= amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}

class FrancTest {
    public void testMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }
}
