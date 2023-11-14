import ru.netology.javamnvn.services.ResortService;

public class Main {

    public static void main(String[] args) {
        ResortService service = new ResortService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }

}



