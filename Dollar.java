import static org.junit.Assert.assertEquals;

class Dollar {
      int amount = 10;
      Dollar(int amount) {}
      void times(int multiplier) {}
}

class DollarTest {
   public void testMultiplication() {
      Dollar five = new Dollar(5);
      five.times(2);
      assertEquals(10, five.amount);
   }
}
