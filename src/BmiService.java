public class BmiService {
    public double calculate (double bodyMassKg, double heightMetre) {
        double index = bodyMassKg / (heightMetre * heightMetre);
        return index;
    }
}
