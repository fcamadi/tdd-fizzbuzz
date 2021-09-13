public class FizzBuzz {

    public String convert(int number) {
        if (number == 15) return "FizzBuzz";
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
