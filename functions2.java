import java.lang.reflect.Array;
import java.util.Arrays;

public class functions2 {
    public static void main(String[] args) {
        unlimits(1,2,3,34,4,5,6,6,6);
    }
    static void unlimits(int ...a){
        System.out.println(Arrays.toString(a));

    }
}
