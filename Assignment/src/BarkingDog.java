public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && hourOfDay > -1 && hourOfDay < 24)
        {
            if (hourOfDay < 8 || hourOfDay > 22)
                return true;
        }
        return false;
    }
}
