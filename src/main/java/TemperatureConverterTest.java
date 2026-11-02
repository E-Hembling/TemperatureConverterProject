import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit_zeroCelsius_returns32() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0));
    }
    @Test
    void FahrenheitToCelsius_212fahrenheit_return100(){
        TemperatureConverter converter2 = new TemperatureConverter();
        assertEquals(100.0, converter2.fahrenheitToCelsius(212));
    }
}