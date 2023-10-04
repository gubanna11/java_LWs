package convert;

public class Convert {
    public static int fromBoolToNum(boolean value){
        return value ? 1 : 0;
    }

    public static boolean fromNumToBool(int value){
        return value > 0;
    }
}
