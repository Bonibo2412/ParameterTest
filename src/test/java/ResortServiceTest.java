import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javamnvn.services.ResortService;

public class ResortServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    
    public void testMonthToResort(int expected, int income, int expenses, int threshold) {
        ResortService service = new ResortService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }


}
