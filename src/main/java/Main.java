public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println(actual);

        expected = 500;
        actual = service.calculate(1000000, true);
        System.out.println(actual);


    }
}