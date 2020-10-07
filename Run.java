public class Run {
    public static void main(String[] args) {
        MoneyTest mt = new MoneyTest();
        mt.testEquality();
        mt.testMultiplication();
        mt.testFrancMultiplication();
        mt.testCurrency();

        System.out.println("Sucesso");
    }
}
