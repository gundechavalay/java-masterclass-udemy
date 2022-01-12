public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int reverse = 0;
        int actualNumber = number;
        int multiplayer = 1;
        if (number < 0)
            number *= -1;
        while (number > 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        if (actualNumber < 0)
            reverse *= -1;
        System.out.println("reverse = " + reverse);
        if (actualNumber == reverse)
            return true;
        else
            return false;
    }
}
