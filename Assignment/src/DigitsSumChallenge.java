public class DigitsSumChallenge {
    public static int sumDigits(int number){
        if (number < 10)
            return -1;
        int sum = 0;
        while (number / 10 !=0){
            sum += number % 10;
            number = number / 10;
        }
        //System.out.println("Sum is " + sum);
        return sum + number;
    }
}
