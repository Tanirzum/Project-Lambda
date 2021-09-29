package PackageTest;

public class Test {
    public static void main(String[] args) {

        Result result = (Integer::sum);
        System.out.println(result.getResult(123, 123));

        Name name = System.out::println;
        name.getResult("Tanirbegren");
    }
}
