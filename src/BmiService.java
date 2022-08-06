public class BmiService {
    public int calculate(int a, int b) {
        int weight = a;
        int height = b;
        int result = (10000 * a) / (b * b);
        return result;
    }

}
