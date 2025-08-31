package assyong.polymorphismT.p_static.mathutil;

public class MathArrayUtils {
    //private static int sumNum= 0;

    private MathArrayUtils() {}

    public static int sum(int[] values) {
        int sumNum = 0;
        for (int i = 0; i < values.length; i++){
            sumNum+=values[i];
        }
        return sumNum;
    }

    public static double average(int[] values){
        return (double) sum(values)/values.length;
    }


    public static int min(int[] values) {
        int min = values[0];
        for(int i = 1; i < values.length; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
