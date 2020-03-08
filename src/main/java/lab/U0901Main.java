package lab;

/**
 * U0901Main
 */
public class U0901Main {
    public static void main(String... args) {
        Integer intArr[] = { 10, 20, 15 };
        Float floatArr[] = new Float[10];
        for (int i = 0; i < 10; i++) {
            floatArr[i] = (float) (Math.random() * 10);
        }

        var insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        var insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);

        System.out.println("Sum of int array: " + insWorkArrayInt.sum());
        // System.out.println("Float array: " + java.util.Arrays.toString(floatArr));
        System.out.println("Sum of float array: " + insWorkArrayFloat.sum());
    }
}