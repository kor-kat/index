public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(55.1, 1.85);
        System.out.println(index);
    }
}