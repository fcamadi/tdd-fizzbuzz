import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "3,Fizz", "6,Fizz", "33,Fizz" })
    void convert_multiple_of_3_to_Fizz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({ "5,Buzz", "10,Buzz", "25,Buzz" })
    void convert_multiple_of_5_to_Buzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }


    @ParameterizedTest
    @ValueSource(ints = { 15,30,45 })
    void convert_multiple_of_3_and_5_to_FizzBuzz_string(int input) {
        assertEquals("FizzBuzz", new FizzBuzz().convert(input));
    }


    @ParameterizedTest
    @CsvSource({  "1,1", "2,2", "3,Fizz", "4,4", "5,Buzz", "6,Fizz", "7,7", "8,8", "9,Fizz", "10,Buzz",
                "11,11", "12,Fizz", "13,13", "14,14", "15,FizzBuzz" })
    void convert_from_1_to_15_to_FizzBuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }


}
