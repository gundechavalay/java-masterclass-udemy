public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second){
        if (first < 10 || second < 10)
            return -1;
        int smallerNumber = (first > second) ? second : first;
        if ((first == smallerNumber && second%smallerNumber == 0) || (second == smallerNumber && first%smallerNumber == 0))
            return smallerNumber;
        int gcd = 1;
        for (int i = 1; i <= smallerNumber/2; i++){
            if ((first%i == 0) && (second%i == 0))
                gcd = i;
        }
        return gcd;
    }
}
