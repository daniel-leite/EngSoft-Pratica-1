public class Run {
    public static void main(String[] args) {
        DollarTest dt = new DollarTest();
        dt.testMultiplication();
        dt.testEquality();

        FrancTest ft = new FrancTest();
        ft.testMultiplication();
        ft.testEquality();

        MoneyTest mt = new MoneyTest();
        mt.testEquality();

        System.out.println("Sucesso");
    }
}
