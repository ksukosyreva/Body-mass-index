public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMass = 98.00;
        double height = 1.85;
        double index = service.calculate(98.00, 1.85);
        System.out.println((int) index);
    }
}
