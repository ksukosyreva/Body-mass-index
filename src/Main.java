public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassKg = 98.00;
        double heightMetre = 1.85;
        double index = service.calculate(98.00, 1.85);
        System.out.println((int) index);
    }
}
