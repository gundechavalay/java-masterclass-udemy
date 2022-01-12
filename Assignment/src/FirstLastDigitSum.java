public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        if (number < 0)
            return -1;
        int lastDigit = number % 10;
        if (number >= 0 && number < 10) {
            return 2 * number;
        }
        while (number / 10 != 0){
            number /= 10;
        }
        return lastDigit + number;
    }
}
