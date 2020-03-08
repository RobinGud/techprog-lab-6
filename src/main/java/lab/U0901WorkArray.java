package lab;

/**
 * U0901WorkArray
 */
public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] NumP) {
        arrNums = NumP;
    }

    double sum() {
        double doubleWork = 0;
        for (T value : arrNums) {
            doubleWork += value.doubleValue();
        }
        return doubleWork;
    }

}