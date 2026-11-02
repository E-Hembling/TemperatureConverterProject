import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    private static final double DELTA = 0.001;

    @Test
    void celsiusToFahrenheit_zeroCelsius_returns32() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), DELTA);
    }
}