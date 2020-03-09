package sync;

/**
 * U1901Thread
 */
public class U1901Thread extends Thread {

    U1901Bank bankWork;
    int intTrans;
    long longSleep;

    U1901Thread(U1901Bank bankWork, int intTrans, long longSleep) {
        this.bankWork = bankWork;
        this.intTrans = intTrans;
        this.longSleep = longSleep;
    }

    @Override
    public void run() {
        bankWork.calc(this.intTrans, this.longSleep);
    }
}