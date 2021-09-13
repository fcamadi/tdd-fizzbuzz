import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "3,Fizz", "6,Fizz", "300,Fizz" })
    void convert_multiple_of_3_to_Fizz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
}
