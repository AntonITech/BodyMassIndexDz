public class Main {
    public static void main(String[] args) {

        //формула (вес / на рост в квадрате)
        BmiService service = new BmiService();
        float myCalc = (float) service.calculate(96, 1.63);

        System.out.println();
        System.out.println("Индекс массы тела: " + myCalc);

    }
}