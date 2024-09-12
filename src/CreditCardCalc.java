public class CreditCardCalc {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double INTEREST_RATE = 1.17;

        creditCardBalance *= INTEREST_RATE;
        System.out.println("Your credit card balance after one month is " + creditCardBalance);

        creditCardBalance *= INTEREST_RATE;
        System.out.println("Your credit card balance after two month is " + creditCardBalance);
}
}