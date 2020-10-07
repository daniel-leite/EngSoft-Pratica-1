import static org.junit.Assert.*;

class Dollar extends Money {
    Dollar(int amount) {
        this.amount= amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

class DollarTest {
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
