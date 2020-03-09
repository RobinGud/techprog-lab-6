package sync;

/**
 * U1901Bank
 */
public class U1901Bank {

    int intTo;
    int intFrom = 220;

    synchronized public void calc(int intTransaction, long longTimeOut) {
        System.out.printf("Before Thread=%s, from=%d, to=%d\n", Thread.currentThread().getName(), intFrom, intTo);
        intFrom -= intTransaction;
        try {

            Thread.sleep(longTimeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.printf("After Thread=%s, from=%d, to=%d\n", Thread.currentThread().getName(), intFrom, intTo);
    }
}