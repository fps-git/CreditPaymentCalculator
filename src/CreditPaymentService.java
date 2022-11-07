public class CreditPaymentService {
    double calculate(int sum, int period, double rate) {
        int periodM = (period * 12);
        double i = rate / 12 / 100;
        return (sum * i * Math.pow(1 + i,periodM)) / (Math.pow(1 + i,periodM) - 1);
    }
}
