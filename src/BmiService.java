public class BmiService {
    public int calculate (double bodyMassKg, double heightMetre) {
        double index = bodyMassKg / (heightMetre * heightMetre);
        return (int)index;
    }
}
