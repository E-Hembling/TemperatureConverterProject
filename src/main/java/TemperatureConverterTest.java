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
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100.0, converter.fahrenheitToCelsius(212));
    }
    @Test
    void celsiusToKelvin_zeroCelsius_returns273Point15() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.15, converter.celsiusToKelvin(0.0));
    }
}