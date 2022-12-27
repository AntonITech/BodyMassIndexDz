public class BmiService {
    public double calculate(int weight, double hight) {

        double index;
        hight = hight * hight;

        double result;
        result = weight / hight;

        return result;
    }
}
