public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double rate = 9.99;
        int sum = 1_000_000;
        System.out.println("Ваш ежемесячный платеж по кредиту на сумму " + sum + " руб. со ставкой " + rate + " % составит:");

        System.out.println();
        System.out.println("При сроке кредита 1 год: " + (int) service.calculate(sum, 1, rate) + " руб.");

        System.out.println();
        System.out.println("При сроке кредита 2 года: " + (int) service.calculate(sum, 2, rate) + " руб.");

        System.out.println();
        System.out.println("При сроке кредита 3 года: " + (int) service.calculate(sum, 3, rate) + " руб.");
    }
}