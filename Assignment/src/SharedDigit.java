public class SharedDigit {
    public static boolean hasSharedDigit (int a, int b){
        if ((a < 10 || a > 99) || (b < 10 || b > 99))
            return false;
        int aDigit = 0;
        int bDigit = 0;
        int bStored = b;
        while (a > 0){
            aDigit = a % 10;
            while (b > 0){
                bDigit = b % 10;
                if (aDigit == bDigit)
                    return true;
                b /= 10;
            }
            b = bStored;
            a /= 10;
        }
        return false;
    }
}
