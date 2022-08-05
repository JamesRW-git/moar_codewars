public class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && !vacation) {
            return true;
        } else return false;
    }
}