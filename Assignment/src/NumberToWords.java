public class NumberToWords {
    public static void numberToWords (int number){
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            int count = getDigitCount(number);
            int reverse = reverse(number);
            int storedReverse = reverse;
            while (reverse > 0){
                switch (reverse % 10){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverse /= 10;
            }
            if (number == 0){
                System.out.println("Zero");
            }
             else if (count - getDigitCount(storedReverse) != 0) {
                int difference = count - getDigitCount(storedReverse);
                while (difference > 0){
                    System.out.println("Zero");
                    difference--;
                }
            }
        }
    }
    public static int reverse (int number){
        int reverse = 0;
        boolean flag = false;
        if (number < 0) {
            number *= -1;
            flag = true;
        }
        while (number > 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        if (flag)
            reverse *= -1;
        return reverse;
    }
    public static int getDigitCount (int number){
        if (number < 0)
            return -1;
        int count = 0;
        do {
            number /= 10;
            count++;
        }while (number > 0);
        return count;
    }
}
