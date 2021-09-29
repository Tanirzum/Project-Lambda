package PackageDouble;

public class DoubleTest {
    private static double value = 2.0;
    private static double value1 = 2.0;

    public static void main(String[] args) {
        ResultDouble resultDouble = () -> {
            value=10;
            return value + value1;
        };
        System.out.println(resultDouble.getResult());
        System.out.println(value);
        System.out.println(value1);
    }
}
