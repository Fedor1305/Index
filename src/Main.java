public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("Ваш индекс массы тела равен: ");
        System.out.println(service.calculate(180, 80));

    }
}


