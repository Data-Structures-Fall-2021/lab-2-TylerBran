public class Lab02 {
import java.util.Arrays;

public class Lab02 {
    public static double[] map(double [] NArray, UnaryFunction ufunction){
        double[] results = new double[NArray.length];
        int i=0;
        for (double N : NArray){
            results[i] = ufunction.exec(N);
            i++;
        }
        System.out.println(Arrays.toString(results));
        return results;
    }
}
}
